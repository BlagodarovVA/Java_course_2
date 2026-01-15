package r9_IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = "Едва дыша, салаты мы доели.\n" +
                "Дойдя до края, примем вновь на грудь.\n" +
                "У алкаша и самурая нету цели.\n" +
                "У них двоих одно есть - только путь.\n";

        // ресурс writer автоматически закроется после блока try
        try(FileWriter writer = new FileWriter("E:\\file1.txt", true);) {

            writer.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
