package r9_IO_NIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\dev_test\\file2.txt");
        File folder = new File("e:\\dev_test\\folder");
        File file2 = new File("file2.txt");
        File folder2 = new File("folder2");

        System.out.println("file.getAbsolutePath: " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath: " + folder.getAbsolutePath());
        System.out.println("----------------------------");

        System.out.println("file.isAbsolute: " + file.isAbsolute());
        System.out.println("folder.isAbsolute: " + folder.isAbsolute());
        System.out.println("----------------------------");

        System.out.println("file.isDirectory: " + file.isDirectory());
        System.out.println("folder.isDirectory: " + folder.isDirectory());
        System.out.println("----------------------------");

        System.out.println("file.exists: " + file.exists());
        System.out.println("folder.exists: " + folder.exists());
        System.out.println("file2.exists: " + file2.exists());
        System.out.println("folder2.exists: " + folder2.exists());
        System.out.println("----------------------------");

        System.out.println("file2.createNewFile: " + file2.createNewFile());
        System.out.println("folder2.mkdir: " + folder2.mkdir());
        System.out.println("----------------------------");

        System.out.println("file.length: " + file.length());
        System.out.println("----------------------------");

        System.out.println("file2.delete: " + file2.delete());
        System.out.println("folder2.delete: " + folder2.delete());  // удалит папку, только если она пуста
        System.out.println("----------------------------");

        File[] files =  folder.listFiles();
        System.out.println("folder.listFiles:");
        // каждый файл с новой строки и проверка, что объект не null
        Arrays.stream(Objects.requireNonNull(files)).forEach(System.out::println);
        System.out.println("----------------------------");

        System.out.println("file.isHidden: " + file.isHidden());
        System.out.println("folder.isHidden: " + folder.isHidden());
        System.out.println("file.canRead: " + file.canRead());
        System.out.println("file.canWrite: " + file.canWrite());
        System.out.println("file.canExecute: " + file.canExecute());
        System.out.println("----------------------------");

    }
}
