package r11_other;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("e:\\dev_test\\f_test10.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                String word = scanner.next();
                set.add(word);
            }
            for (String word:set){
                System.out.println(word);   // вывод уникальных слов в алфавитном порядке
            }


        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            Objects.requireNonNull(scanner).close();
        }
    }
}
