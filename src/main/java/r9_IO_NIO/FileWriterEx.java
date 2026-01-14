package r9_IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Едва дыша, салаты мы доели.\n" +
                "Дойдя до края, примем вновь на грудь.\n" +
                "У алкаша и самурая нету цели.\n" +
                "У них двоих одно есть - только путь.\n";
        String s = "privet";
        FileWriter writer=null;
        try {
            writer = new FileWriter("E:\\file1.txt", true); //второй параметр позволяет дописывать в конец файла
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
//            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
