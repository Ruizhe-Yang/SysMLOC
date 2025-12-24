package dut.control.sysmloc.util;

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

public class MergeSysML {
	
    public static void main(String[] args) throws Exception {
        String modelPath;
        if (args.length > 0) {
            modelPath = args[0];
        } else {
//            modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\training2\\17. Control\\Control Structures Example.model";
        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test"; 
//        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\kerml";
//        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\sysml.library";
//        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\sysml-modified";
        }
//        Path out = convertModelToSysml(modelPath);
//        System.out.println("Done. Written to: " + out.toAbsolutePath());
//        mergeSysmlFilesRecursively(modelPath);
        deleteGeneratedSysmlFiles(modelPath);
//        deleteAllModelFilesRecursively(modelPath);
    }
    
    public static int deleteAllModelFilesRecursively(String folderPath) throws IOException {
        if (folderPath == null || folderPath.isBlank()) {
            throw new IllegalArgumentException("folderPath is null/blank");
        }

        Path root = Paths.get(folderPath).toAbsolutePath().normalize();
        if (!Files.isDirectory(root)) {
            throw new IllegalArgumentException("Not a directory: " + root);
        }

        int[] deleted = {0};

        // Files.walk 会递归遍历（包含子目录）
        try (Stream<Path> stream = Files.walk(root)) {
            stream.filter(Files::isRegularFile)
                  .filter(p -> p.getFileName().toString().endsWith(".model"))
                  .forEach(p -> {
                      try {
                          if (Files.deleteIfExists(p)) {
                              deleted[0]++;
                          }
                      } catch (IOException e) {
                          // 如需“遇到错误继续删其他文件”，可改为打印日志后 continue
                          throw new RuntimeException("Failed to delete: " + p, e);
                      }
                  });
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException io) throw io;
            throw e;
        }

        return deleted[0];
    }
    
    public static void deleteGeneratedSysmlFiles(String folderPath) throws IOException {
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
     * 对每个目录 D，在 D 下生成 "<D目录名>.sysml"，并合并 D 目录下(仅本层)所有 .sysml 文件。
     */
    public static void mergeSysmlFilesRecursively(String rootFolderPath) throws IOException {
        mergeSysmlFilesRecursively(rootFolderPath, StandardCharsets.UTF_8);
    }

    public static void mergeSysmlFilesRecursively(String rootFolderPath, Charset charset) throws IOException {
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
     * 合并单个目录 dir 下(仅本层)的 .sysml 文件，输出为 "<dirName>.sysml"
     */
    private static void mergeOneDirectory(Path dir, Charset charset) throws IOException {
        String dirName = dir.getFileName() == null ? "root" : dir.getFileName().toString();
        String outputFileName = dirName + ".sysml";
        Path out = dir.resolve(outputFileName);

        // 收集 dir 下(仅本层)的 .sysml 文件，排除输出文件本身
        List<Path> sysmlFiles;
        try (Stream<Path> s = Files.list(dir)) {
            sysmlFiles = s.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().toLowerCase().endsWith(".sysml"))
                    .filter(p -> !p.getFileName().toString().equalsIgnoreCase(outputFileName))
                    .sorted(Comparator.comparing(p -> p.getFileName().toString(), String.CASE_INSENSITIVE_ORDER))
                    .collect(Collectors.toList());
        }

        // 如果本目录没有可合并的 sysml 文件，可按需选择：不生成 / 生成空文件
        // 这里选择：没有输入文件就不生成(或删除已有旧输出)
        if (sysmlFiles.isEmpty()) {
            // 若你希望保留旧文件可注释掉下面这段
            if (Files.exists(out)) {
                Files.delete(out);
            }
            return;
        }

        // 覆盖写入
        try (BufferedWriter writer = Files.newBufferedWriter(out, charset,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {

            for (Path f : sysmlFiles) {
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
