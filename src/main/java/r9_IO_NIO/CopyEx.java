package r9_IO_NIO;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        // копируем один файл во второй с помощью буфера
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\file1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\file2.txt"))) {

            // копируем посимвольно
//            int character;
//            while ((character=reader.read()) != -1){
//                writer.write(character);
//            }
//            System.out.println("Done!");

            // копируем построчно
            String line;
            while ((line=reader.readLine()) != null){
                writer.write(line);
                writer.write('\n');

                System.out.println(line);
            }
            System.out.println("----------");
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
