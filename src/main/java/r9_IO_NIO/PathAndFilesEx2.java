package r9_IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("f_test14.txt");
        Path directoryPath = Paths.get("e:\\dev_test\\M");
        Path directoryBPath = Paths.get("e:\\dev_test\\B");

        // если выходной файл существует, будет исключение
//        Files.copy(filePath, directoryPath.resolve(filePath));

        // перезапись файла, если он существует
//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath, directoryPath.resolve("test15.txt"));

        // копируем папку \B в \M БЕЗ СОДЕРЖИМОГО
//        Files.copy(directoryBPath, directoryPath.resolve("B"));

        // Перемещение файла
//        Files.move(filePath, directoryPath.resolve("f_test14.txt"));

        // переименование файла перемещением с новым именем
//        Files.move(Paths.get("e:\\dev_test\\f_test10.txt"), Paths.get("e:\\dev_test\\f_test11.txt"));

        // удаление
//        Files.delete(Paths.get("e:\\dev_test\\f_test11.txt"));
//        Files.delete(directoryPath);        // можно удалить, если папка пустая
















        System.out.println("Done!");
    }
}
