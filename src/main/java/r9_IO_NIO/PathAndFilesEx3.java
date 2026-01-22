package r9_IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("f_test15.txt");
//        Files.createFile((filePath));
//        String dialog = "-Privet.\n-Privet.\n-Kak dela?\n-Horosho. Kak u tebya?\n-Tozhe horosho.";
//        Files.write(filePath, dialog.getBytes());

        List<String> list =  Files.readAllLines(filePath);
        for(String s: list){
            System.out.println(s);
        }
    }
}
