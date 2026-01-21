package r9_IO_NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile file =
            new RandomAccessFile("e:\\dev_test\\f_test10.txt", "rw");
            FileChannel chanel = file.getChannel();
        ){
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();

            /* читаем из файла и пишем в буффер
            * возвращает кол-во прочитанных байт
            */
            int byteRead = chanel.read(buffer);
            while (byteRead > 0){
                System.out.println("Read " + byteRead);

                buffer.flip();      // преключение режима буффера на чтение

                while (buffer.hasRemaining()){          // читаем, пока есть что читать
                    stih.append((char) buffer.get());   // записываем в стрингбилдер
                }

                buffer.clear();                     // переключаем буффер в режим записи, позиция устанавливается в 0
                byteRead = chanel.read(buffer);     // читаем из файла и пишем в буффер
            }
            System.out.println(stih);

            String text = "\nThere are only 2 ways to live your life." +
                    "1 isas though nothing is a miracle. The otheris as" +
                    "though everything is a miracle.";

            ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());  // делает тоже запись, но меньше кода
            chanel.write(buffer3);

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);   // размер буфера = размер текста в байтах
//            buffer2.put(text.getBytes());           // запись в буффер
//            buffer2.flip();                         // преключение режима буффера на чтение для записи в файл
//            chanel.write(buffer2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}








