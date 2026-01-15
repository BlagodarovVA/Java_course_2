package r9_IO_NIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTryWithResources {
    public static void main(String[] args) throws IOException {

        // ресурс reader автоматически закроется после блока try
        try(FileReader reader = new FileReader("E:\\file1.txt");) {
            int character;
            while ((character=reader.read()) != -1){
                System.out.print((char)character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
