package r9_IO_NIO;

import java.io.*;

public class CopyPictureEx {

    public static void main(String[] args) {
        // копируем картинку с помощью буфера
        try(FileInputStream fis = new FileInputStream("C:\\Users\\blagodarov\\Downloads\\anime-aesthetic-s-hd-wallpaper.jpg");
            FileOutputStream fos = new FileOutputStream("E:\\f_wallpaper.jpg")) {

            int i;
            while ((i = fis.read()) != -1){
                fos.write(i);
            }

            System.out.println("----------");
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
