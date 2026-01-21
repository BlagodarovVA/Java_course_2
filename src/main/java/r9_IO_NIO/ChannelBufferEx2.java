package r9_IO_NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("e:\\dev_test\\f_test13.txt", "r");
            FileChannel channel = file.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());

            System.out.println("----- rewind() -----");
            buffer.rewind();                            // поместит позицию на ячейку 0
            System.out.println((char)buffer.get());     // a

            /*
            * compact в отличие от clear
            * смещает непрочитанные элементы в начало буфера,
            * а позицию для записи устанавливает после непрочитанных элементов
            */
            System.out.println("----- compact() -----");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());     // b c d e f
            }

            System.out.println("----- mark() -----");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            buffer.mark();                                  // ставим отметку на h
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            buffer.reset();                                 // возвращаем позицию на отметку
            System.out.println("----- reset() -----");
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());     // вывести все оставшееся в буффере
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
