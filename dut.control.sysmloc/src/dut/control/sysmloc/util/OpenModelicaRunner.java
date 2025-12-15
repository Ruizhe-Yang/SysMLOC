package dut.control.sysmloc.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class OpenModelicaRunner {

    public static class OmResult {
        public final int exitCode;
        public final String stdout;
        public final String stderr;
        public final Path resultMat;   // 可能为 null（例如仿真失败或未生成）
        public final Path workingDir;  // 工作目录（含 mos、日志、结果文件等）

        public OmResult(int exitCode, String stdout, String stderr, Path resultMat, Path workingDir) {
            this.exitCode = exitCode;
            this.stdout = stdout;
            this.stderr = stderr;
            this.resultMat = resultMat;
            this.workingDir = workingDir;
        }
    }

    public static void main(String[] args) throws Exception {
        var res = OpenModelicaRunner.runSimulation(
                "F:\\OpenModelica1.25.5-64bit\\bin\\omc.exe",
                Path.of("E:\\GitYang\\SysMLOC\\runtime.test\\BouncingBall.mo"),
                "BouncingBall",
                10.0,
                0.01,
                Duration.ofMinutes(2)
        );

        System.out.println("exitCode=" + res.exitCode);
        System.out.println("stdout:\n" + res.stdout);
        System.out.println("stderr:\n" + res.stderr);
        System.out.println("resultMat=" + res.resultMat);
        System.out.println("workingDir=" + res.workingDir);
    }

    /**
     * 运行 OpenModelica: loadFile(moFile) -> checkModel(modelName) -> simulate(modelName)
     * 并将生成物输出到 .mo 文件所在目录。
     */
    public static OmResult runSimulation(
            String omcPath,
            Path moFile,
            String modelName,
            double stopTime,
            Double stepSize,
            Duration timeout
    ) throws IOException, InterruptedException, TimeoutException {

        if (!Files.isRegularFile(moFile)) {
            throw new IllegalArgumentException("mo file not found: " + moFile);
        }

        if (modelName == null || modelName.isBlank()) {
            modelName = stripExt(moFile.getFileName().toString());
        }

        // ===== 1. 创建“仿真结果子目录” =====
        Path parentDir = moFile.toAbsolutePath().getParent();
        if (parentDir == null) {
            throw new IllegalArgumentException("Cannot resolve parent dir of " + moFile);
        }

        String ts = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String safeModel = modelName.replace('.', '_');

        Path workDir = parentDir.resolve(safeModel + "_sim_" + ts);
        Files.createDirectories(workDir);

        // ===== 2. 文件名前缀（不含扩展名）=====
        String fileNamePrefix = safeModel + "_res";

        // ===== 3. 生成 mos =====
        Path mos = workDir.resolve("run.mos");

        String moPathForMos = moFile.toAbsolutePath().toString().replace("\\", "/");
        String wdForMos = workDir.toAbsolutePath().toString().replace("\\", "/");

        StringBuilder simulateArgs = new StringBuilder();
        simulateArgs.append("simulate(").append(modelName).append(", ");
        simulateArgs.append("stopTime=").append(stopTime).append(", ");
        if (stepSize != null) {
            simulateArgs.append("stepSize=").append(stepSize).append(", ");
        }
        simulateArgs.append("outputFormat=\"mat\", ");
        simulateArgs.append("fileNamePrefix=\"").append(fileNamePrefix).append("\"");
        simulateArgs.append(");");

        String mosContent = ""
                + "cd(\"" + wdForMos + "\");\n"
                + "setCommandLineOptions(\"--std=3.3\");\n"
                + "getErrorString();\n"
                + "loadFile(\"" + moPathForMos + "\");\n"
                + "print(getErrorString());\n"
                + "checkModel(" + modelName + ");\n"
                + "print(getErrorString());\n"
                + simulateArgs + "\n"
                + "print(getErrorString());\n"
                + "quit();\n";

        Files.writeString(mos, mosContent, StandardCharsets.UTF_8);

        // ===== 4. 调用 omc =====
        ProcessBuilder pb = new ProcessBuilder(
                omcPath,
                mos.toAbsolutePath().toString()
        );
        pb.redirectErrorStream(false);

        Process p = pb.start();

        ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> outF = es.submit(() -> readAll(p.getInputStream()));
		Future<String> errF = es.submit(() -> readAll(p.getErrorStream()));

        boolean finished = p.waitFor(timeout.toMillis(), TimeUnit.MILLISECONDS);
        if (!finished) {
            p.destroyForcibly();
            es.shutdownNow();
            throw new TimeoutException("omc timed out after " + timeout);
        }

        int exitCode = p.exitValue();
        String stdout, stderr;
        try {
            stdout = outF.get(2, TimeUnit.SECONDS);
            stderr = errF.get(2, TimeUnit.SECONDS);
        } catch (Exception e) {
            stdout = "";
            stderr = "Failed to capture output: " + e.getMessage();
        } finally {
            es.shutdownNow();
        }

        // ===== 5. 查找 result.mat =====
        Path resultMat = null;
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(
                workDir,
                pth -> pth.getFileName().toString().endsWith(".mat")
        )) {
            for (Path pth : ds) {
                if (pth.getFileName().toString().contains(fileNamePrefix)) {
                    resultMat = pth;
                    break;
                }
            }
        }

        return new OmResult(exitCode, stdout, stderr, resultMat, workDir);
    }

    private static String readAll(InputStream in) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append('\n');
            }
            return sb.toString();
        }
    }

    private static String stripExt(String name) {
        int idx = name.lastIndexOf('.');
        return (idx >= 0) ? name.substring(0, idx) : name;
    }
}
