package r9_IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("f_test14.txt");
        Path directoryPath = Paths.get("e:\\dev_test\\M");

        System.out.println("----- getFileName() -----");
        System.out.println("filePath: " + filePath.getFileName());
        System.out.println("directoryPath: " + directoryPath.getFileName());

        System.out.println("----- getParent() -----");
        System.out.println("filePath: " + filePath.getParent());
        System.out.println("directoryPath: " + directoryPath.getParent());

        System.out.println("----- isAbsolute() -----");
        System.out.println("filePath: " + filePath.isAbsolute());
        System.out.println("directoryPath: " + directoryPath.isAbsolute());

        System.out.println("----- toAbsolutePath() -----");
        System.out.println("filePath: " + filePath.toAbsolutePath());
        System.out.println("directoryPath: " + directoryPath.toAbsolutePath());

        System.out.println("----- toAbsolutePath().getParent() -----");
        System.out.println("filePath: " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath: " + directoryPath.toAbsolutePath().getParent());

        System.out.println("----- toAbsolutePath().getRoot() -----");
        System.out.println("filePath: " + filePath.toAbsolutePath().getRoot());
        System.out.println("directoryPath: " + directoryPath.toAbsolutePath().getRoot());

        System.out.println("----- relativize() -----");
        Path anotherPath = Paths.get("e:\\dev_test\\M\\N\\Z\\test14.txt");
        System.out.println("directoryPath: " + directoryPath.relativize(anotherPath));

        System.out.println("----- exists() -----");
        if(!Files.exists(filePath)){
            Files.createFile(filePath);
            System.out.println("File created");
        }
        if(!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
            System.out.println("Directory created");
        }

        System.out.println("----- Files. -----");
        System.out.println("isReadable(filePath): " + Files.isReadable(filePath));
        System.out.println("isWritable(filePath): " + Files.isWritable(filePath));
        System.out.println("isExecutable(filePath): " + Files.isExecutable(filePath));

        System.out.println("----- isSameFile() -----");
        Path filePath2 = Paths.get("E:\\Java_repos\\Java_course_2\\f_test14.txt");
        System.out.println("isSameFile(filePath, filePath2): " + Files.isSameFile(filePath, filePath2));

        System.out.println("----- size() -----");
        System.out.println("size(filePath): " + Files.size(filePath));

        System.out.println("----- getAttribute() -----");
        System.out.println("getAttribute(creationTime): " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("getAttribute(size): " + Files.getAttribute(filePath, "size"));

        System.out.println("----- Получаем все аттрибуты: -----");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry: attributes.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}



