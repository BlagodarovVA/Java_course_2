package r9_IO_NIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile file =
            new RandomAccessFile("E:\\f_test10.txt", "rw")){    // 2 параметр - режим работы с файлом

            int a = file.read();
            System.out.println((char) a);
            // вывод строки будет со 2 символа, т.к. поинтер переместился
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(111);                     // установка поинтера на позицию
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();  // получение позиции поинтера
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("privet\n");

            file.seek(file.length());           // конец файла
            file.writeBytes("\n\t\tAuthor stishka");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


