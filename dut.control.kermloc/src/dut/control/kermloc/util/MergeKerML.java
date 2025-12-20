package dut.control.kermloc.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.attribute.BasicFileAttributes;

public class MergeKerML {
	
    public static void main(String[] args) throws Exception {
        String modelPath;
        if (args.length > 0) {
            modelPath = args[0];
        } else {
//            modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\training2\\17. Control\\Control Structures Example.model";
        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\test\\Library\\Domain Libraries";
        }
//        Path out = convertModelToKerml(modelPath);
//        System.out.println("Done. Written to: " + out.toAbsolutePath());
        mergeKermlFilesRecursively(modelPath);
//        deleteGeneratedKermlFiles(modelPath);
    }
    
    public static void deleteGeneratedKermlFiles(String folderPath) throws IOException {
        Path root = Paths.get(folderPath);
        if (!Files.isDirectory(root)) {
            throw new IllegalArgumentException("Not a directory: " + folderPath);
        }

        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException {
                String name = file.getFileName().toString();
                if (name.startsWith("gen-")) {
                    Files.delete(file);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }
    
    /**
     * 递归遍历 rootFolderPath 下的所有目录；
     * 对每个目录 D，在 D 下生成 "<D目录名>.kerml"，并合并 D 目录下(仅本层)所有 .kerml 文件。
     */
    public static void mergeKermlFilesRecursively(String rootFolderPath) throws IOException {
        mergeKermlFilesRecursively(rootFolderPath, StandardCharsets.UTF_8);
    }

    public static void mergeKermlFilesRecursively(String rootFolderPath, Charset charset) throws IOException {
        Path root = Paths.get(rootFolderPath);
        if (!Files.isDirectory(root)) {
            throw new IllegalArgumentException("Not a directory: " + rootFolderPath);
        }

        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                mergeOneDirectory(dir, charset);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    /**
     * 合并单个目录 dir 下(仅本层)的 .kerml 文件，输出为 "<dirName>.kerml"
     */
    private static void mergeOneDirectory(Path dir, Charset charset) throws IOException {
        String dirName = dir.getFileName() == null ? "root" : dir.getFileName().toString();
        String outputFileName = dirName + ".kerml";
        Path out = dir.resolve(outputFileName);

        // 收集 dir 下(仅本层)的 .kerml 文件，排除输出文件本身
        List<Path> kermlFiles;
        try (Stream<Path> s = Files.list(dir)) {
            kermlFiles = s.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().toLowerCase().endsWith(".kerml"))
                    .filter(p -> !p.getFileName().toString().equalsIgnoreCase(outputFileName))
                    .sorted(Comparator.comparing(p -> p.getFileName().toString(), String.CASE_INSENSITIVE_ORDER))
                    .collect(Collectors.toList());
        }

        // 如果本目录没有可合并的 kerml 文件，可按需选择：不生成 / 生成空文件
        // 这里选择：没有输入文件就不生成(或删除已有旧输出)
        if (kermlFiles.isEmpty()) {
            // 若你希望保留旧文件可注释掉下面这段
            if (Files.exists(out)) {
                Files.delete(out);
            }
            return;
        }

        // 覆盖写入
        try (BufferedWriter writer = Files.newBufferedWriter(out, charset,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {

            for (Path f : kermlFiles) {
                writer.write("// ===== BEGIN: " + f.getFileName() + " =====");
                writer.newLine();

                try (BufferedReader reader = Files.newBufferedReader(f, charset)) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }

                writer.write("// ===== END: " + f.getFileName() + " =====");
                writer.newLine();
                writer.newLine();
            }
        }
    }
}
