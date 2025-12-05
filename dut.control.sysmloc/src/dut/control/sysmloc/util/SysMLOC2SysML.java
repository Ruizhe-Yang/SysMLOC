package dut.control.sysmloc.util;
import com.google.inject.Injector;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.serializer.ISerializer;

import dut.control.sysmloc.SysMLOCStandaloneSetup; 

public class SysMLOC2SysML {
    private static final Injector injector =
            new SysMLOCStandaloneSetup().createInjectorAndDoEMFRegistration();

    public static void main(String[] args) throws Exception {
        // 如果传了参数就用参数，否则用一个默认示例路径
        String modelPath;
        if (args.length > 0) {
            modelPath = args[0];
        } else {
//            modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\training2\\17. Control\\Control Structures Example.model";
        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\sysml\\src\\training";
        }
//        Path out = convertModelToSysml(modelPath);
//        System.out.println("Done. Written to: " + out.toAbsolutePath());
        convertAllModelsInFolder(modelPath);
        
    }
    
    public static void convertAllModelsInFolder(String folderPath) throws Exception {
        Path dir = Paths.get(folderPath).toAbsolutePath();
        if (!Files.isDirectory(dir)) {
            throw new IllegalArgumentException("Not a directory: " + dir);
        }

        int count = 0;

        // 递归遍历所有子目录，查找 *.model 文件
        try {
            // 默认不跟随符号链接，如果你有软链接可以再加选项
            try (java.util.stream.Stream<Path> paths = Files.walk(dir)) {
                java.util.Iterator<Path> it = paths.iterator();
                while (it.hasNext()) {
                    Path p = it.next();
                    if (Files.isRegularFile(p) && p.toString().endsWith(".model")) {
                        count++;
                        String absModelPath = p.toAbsolutePath().toString();
                        try {
                            Path out = convertModelToSysml(absModelPath);
                            System.out.println("[Successfully Generate SysML v2] " + dir.relativize(p)
                                    + " -> " + out.getFileName());
                        } catch (Exception e) {
                            System.err.println("[FAIL] " + dir.relativize(p)
                                    + " : " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error while walking folder " + dir + ": " + e.getMessage());
            throw e;
        }

        System.out.println("Done. Processed " + count + " .model files under " + dir);
    }

    /**
     * 把一个 .model 文件转换为排版好的 .sysml 文件：
     * - 输出路径 = 同目录 / "gen-" + 原文件名（去掉扩展名） + ".sysml"
     * - 返回生成的文件路径
     */
    public static Path convertModelToSysml(String modelFilePath) throws Exception {
        // 1) 解析输入路径 & 生成输出路径
        Path inPath = Paths.get(modelFilePath).toAbsolutePath();
        String fileName = inPath.getFileName().toString();           // VehicleUsages.model
        int dot = fileName.lastIndexOf('.');
        String baseName = (dot >= 0) ? fileName.substring(0, dot) : fileName;
        String outFileName = "gen-" + baseName + ".sysml";

        Path parent = inPath.getParent();
        Path outPath = (parent != null)
                ? parent.resolve(outFileName)
                : Paths.get(outFileName);

        // 2) 为 .model 注册 XMI ResourceFactory（每次调用都可以这样写，简单直接）
        ResourceSetImpl emfRs = new ResourceSetImpl();
        emfRs.getResourceFactoryRegistry()
             .getExtensionToFactoryMap()
             .put("model", new XMIResourceFactoryImpl());

        // 3) 加载 .model 文件为 EMF 模型
        URI modelUri = URI.createFileURI(inPath.toString());
        Resource emfRes = emfRs.getResource(modelUri, true);
        EObject root = emfRes.getContents().get(0);

        // 4) 使用 Xtext 的 ISerializer 把 EMF 模型序列化成原始文本
        ISerializer serializer = injector.getInstance(ISerializer.class);
        String rawText = serializer.serialize(root);

        // 5) 调用你已经实现好的自定义排版函数
        String formatted = formatSysmloc(rawText);

        // 6) 写入生成的 .sysml 文件
        Files.write(outPath, formatted.getBytes(StandardCharsets.UTF_8));

        return outPath;
    }
    
	private static String formatSysmloc(String input) {
	    StringBuilder out = new StringBuilder();
	    int indent = 0;
	    boolean inWhitespace = false;
	    boolean atLineStart = true;     // 当前是否在行首
	    boolean inBlockComment = false; // 是否处于 /* ... */ 内部

	    int len = input.length();
	    for (int i = 0; i < len; i++) {
	        char c = input.charAt(i);

	        // ======================
	        // 先处理块注释内部逻辑
	        // ======================
	        if (inBlockComment) {
	            // 块注释结束：*/
	            if (c == '*' && i + 1 < len && input.charAt(i + 1) == '/') {
	                out.append("*/");
	                out.append('\n');
	                appendIndent(out, indent);
	                atLineStart = true;
	                inWhitespace = false;
	                inBlockComment = false;
	                i++; // 跳过 '/'
	                continue;
	            }

	            // 块注释内部的换行：把 \r\n 当成一次换行
	            if (c == '\r' || c == '\n') {
	                // 如果是 \r\n，跳过第二个字符
	                if (c == '\r' && i + 1 < len && input.charAt(i + 1) == '\n') {
	                    i++;
	                }
	                out.append('\n');
	                atLineStart = true;
	                inWhitespace = false;
	                continue;
	            }

	            // 块注释内部的其它字符：原样输出
	            out.append(c);
	            atLineStart = false;
	            continue;
	        }

	        // ======================
	        // 非块注释状态下的特殊模式
	        // ======================

	        // ① 单行注释：// ...，整行抄完然后换行
	        if (c == '/' && i + 1 < len && input.charAt(i + 1) == '/') {
	            out.append("//");
	            i += 2; // 已处理 "//"

	            while (i < len) {
	                char cc = input.charAt(i);
	                if (cc == '\n' || cc == '\r') {
	                    break;
	                }
	                out.append(cc);
	                i++;
	            }

	            out.append('\n');
	            appendIndent(out, indent);
	            atLineStart = true;
	            inWhitespace = false;
	            continue;
	        }

	        // ② 块注释开始：/* ... */
	        if (c == '/' && i + 1 < len && input.charAt(i + 1) == '*') {
	            out.append("/*");
	            inBlockComment = true;
	            atLineStart = false;
	            inWhitespace = false;
	            i++; // 跳过 '*'
	            continue;
	        }

	        // ======================
	        // 正常代码字符
	        // ======================
	        switch (c) {
		        case '{':
		            // 如果不在行首，说明这行前面已经有内容，比如
		            // "part def Vehicle {"，此时删掉 Token 和 '{' 之间的多余空格
		            if (!atLineStart) {
		                int pos3 = out.length() - 1;
		                while (pos3 >= 0) {
		                    char pc3 = out.charAt(pos3);
		                    if (pc3 == ' ' || pc3 == '\t') {
		                        pos3--;
		                    } else {
		                        break;
		                    }
		                }
		                out.setLength(pos3 + 1);
		            }
	
		            // 然后再输出 '{' 和换行
		            out.append('{');
		            out.append('\n');
		            indent++;
		            appendIndent(out, indent);
		            atLineStart = true;
		            inWhitespace = false;
		            break;


	            case '}':
	                // 清掉当前行尾部空格/Tab
	                int pos = out.length() - 1;
	                while (pos >= 0) {
	                    char pc = out.charAt(pos);
	                    if (pc == ' ' || pc == '\t') {
	                        pos--;
	                    } else {
	                        break;
	                    }
	                }
	                out.setLength(pos + 1);

	                // 如果最后一个字符不是换行，就先断行
	                if (pos >= 0 && out.charAt(pos) != '\n') {
	                    out.append('\n');
	                }

	                // 回到上一层缩进
	                indent = Math.max(0, indent - 1);

	                // 按当前缩进输出 '}'
	                appendIndent(out, indent);
	                out.append('}');
	                out.append('\n');

	                // 下一行应用当前缩进
	                appendIndent(out, indent);

	                atLineStart = true;
	                inWhitespace = false;
	                break;

	            case ';':
	                // 删掉行尾多余的空格/Tab，让 ';' 紧贴前一个单词
	                int pos2 = out.length() - 1;
	                while (pos2 >= 0) {
	                    char pc2 = out.charAt(pos2);
	                    if (pc2 == ' ' || pc2 == '\t') {
	                        pos2--;
	                    } else {
	                        break;
	                    }
	                }
	                out.setLength(pos2 + 1);

	                // 再输出 ';' 和换行
	                out.append(';');
	                out.append('\n');
	                appendIndent(out, indent);

	                atLineStart = true;
	                inWhitespace = false;
	                break;


	            case '\r':
	            case '\n':
	                // 正常代码部分的原始换行忽略，由我们自己控制换行
	                break;

	            default:
	                if (Character.isWhitespace(c)) {
	                    // 行首不输出多余空格；非行首把连续空白折叠成一个空格
	                    if (!inWhitespace && !atLineStart) {
	                        out.append(' ');
	                        inWhitespace = true;
	                    }
	                } else {
	                    if (atLineStart) {
	                        atLineStart = false;
	                    }
	                    out.append(c);
	                    inWhitespace = false;
	                }
	                break;
	        }
	    }

	    return out.toString().trim() + System.lineSeparator();
	}

	/** 缩进：每层 4 个空格 */
	private static void appendIndent(StringBuilder out, int indent) {
	    for (int i = 0; i < indent; i++) {
	        out.append("\t");
	    }
	}
	
}
