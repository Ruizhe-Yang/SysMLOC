package dut.control.kermloc.util;
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

import dut.control.kermloc.KerMLOCStandaloneSetup; 

public class KerMLOC2KerML {
    private static final Injector injector =
            new KerMLOCStandaloneSetup().createInjectorAndDoEMFRegistration();

    public static void main(String[] args) throws Exception {
        String modelPath;
        if (args.length > 0) {
            modelPath = args[0];
        } else {
            modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\kerml";
//        	 modelPath = "E:\\GitYang\\SysMLOC\\runtime.test\\sysml.library";
        }
//        Path out = convertModelToKerml(modelPath);
//        System.out.println("Done. Written to: " + out.toAbsolutePath());
        convertAllModelsInFolder2(modelPath);
        
    }
    public static void convertAllModelsInFolder2(String folderPath) throws Exception {
        Path dir = Paths.get(folderPath).toAbsolutePath();
        if (!Files.isDirectory(dir)) {
            throw new IllegalArgumentException("Not a directory: " + dir);
        }

        int count = 0;

        try (java.util.stream.Stream<Path> paths = Files.walk(dir)) {
            java.util.Iterator<Path> it = paths.iterator();
            while (it.hasNext()) {
                Path p = it.next();

                if (!Files.isRegularFile(p)) {
                    continue;
                }

                String fileName = p.getFileName().toString();
                if (!fileName.endsWith(".kermloc")) {
                    continue;
                }
                if (fileName.startsWith("gen-")) {
                    System.out.println("[SKIP] " + dir.relativize(p) + " (gen-prefix)");
                    continue;
                }

                count++;
                String absModelPath = p.toAbsolutePath().toString();
                try {
                    Path out = convertModelToKerml(absModelPath);
                    System.out.println("[GEN] " + dir.relativize(p)
                            + " -> " + out.getFileName());
                } catch (Exception e) {
                    System.err.println("[FAIL] " + dir.relativize(p)
                            + " : " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done. Processed " + count + " .kermloc files under " + dir);
    }

    /**
     * 把一个 .kermloc 文件转换为排版好的 .kerml 文件：
     * - 输出路径 = 同目录 / "gen-" + 原文件名（去掉扩展名） + ".kerml"
     * - 返回生成的文件路径
     */
    public static Path convertModelToKerml(String modelFilePath) throws Exception {
        Path inPath = Paths.get(modelFilePath).toAbsolutePath();
        String fileName = inPath.getFileName().toString();
        int dot = fileName.lastIndexOf('.');
        String baseName = (dot >= 0) ? fileName.substring(0, dot) : fileName;
        String outFileName = "gen-" + baseName + ".kerml";

        Path parent = inPath.getParent();
        Path outPath = (parent != null)
                ? parent.resolve(outFileName)
                : Paths.get(outFileName);
        ResourceSetImpl emfRs = new ResourceSetImpl();
        emfRs.getResourceFactoryRegistry()
             .getExtensionToFactoryMap()
             .put("kermloc", new XMIResourceFactoryImpl());
        URI modelUri = URI.createFileURI(inPath.toString());
        Resource emfRes = emfRs.getResource(modelUri, true);
        EObject root = emfRes.getContents().get(0);
        ISerializer serializer = injector.getInstance(ISerializer.class);
        String rawText = serializer.serialize(root);
        String formatted = formatKerMLOC(rawText);
        Files.write(outPath, formatted.getBytes(StandardCharsets.UTF_8));
        return outPath;
    }
    
	private static String formatKerMLOC(String input) {
	    StringBuilder out = new StringBuilder();
	    int indent = 0;
	    boolean inWhitespace = false;
	    boolean atLineStart = true;
	    boolean inBlockComment = false; 
	    int len = input.length();
	    for (int i = 0; i < len; i++) {
	        char c = input.charAt(i);
	        if (inBlockComment) {
	            if (c == '*' && i + 1 < len && input.charAt(i + 1) == '/') {
	                out.append("*/");
	                out.append('\n');
	                appendIndent(out, indent);
	                atLineStart = true;
	                inWhitespace = false;
	                inBlockComment = false;
	                i++;
	                continue;
	            }
	            if (c == '\r' || c == '\n') {
	                if (c == '\r' && i + 1 < len && input.charAt(i + 1) == '\n') {
	                    i++;
	                }
	                out.append('\n');
	                atLineStart = true;
	                inWhitespace = false;
	                continue;
	            }
	            out.append(c);
	            atLineStart = false;
	            continue;
	        }

	        if (c == '/' && i + 1 < len && input.charAt(i + 1) == '/') {
	            out.append("//");
	            i += 2; 

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

	        if (c == '/' && i + 1 < len && input.charAt(i + 1) == '*') {
	            out.append("/*");
	            inBlockComment = true;
	            atLineStart = false;
	            inWhitespace = false;
	            i++;
	            continue;
	        }

	        switch (c) {
		        case '{':
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
		            out.append('{');
		            out.append('\n');
		            indent++;
		            appendIndent(out, indent);
		            atLineStart = true;
		            inWhitespace = false;
		            break;


	            case '}':
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
	                if (pos >= 0 && out.charAt(pos) != '\n') {
	                    out.append('\n');
	                }
	                indent = Math.max(0, indent - 1);
	                appendIndent(out, indent);
	                out.append('}');
	                out.append('\n');
	                appendIndent(out, indent);
	                atLineStart = true;
	                inWhitespace = false;
	                break;

	            case ';':
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
	                out.append(';');
	                out.append('\n');
	                appendIndent(out, indent);

	                atLineStart = true;
	                inWhitespace = false;
	                break;


	            case '\r':
	            case '\n':
	                break;

	            default:
	                if (Character.isWhitespace(c)) {
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

	private static void appendIndent(StringBuilder out, int indent) {
	    for (int i = 0; i < indent; i++) {
	        out.append("\t");
	    }
	}
	
}
