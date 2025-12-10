package collection_4.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        // в TreeMap элементы отсортированы по возрастанию
        // ключи должны быть уникальными
        TreeMap<Student2, Double> treeMap = new TreeMap<>();

        // 2 вариант реализации сравнения, если не хочется имплементировать для класса Comparable
        TreeMap<Student2, Double> treeMap2 = new TreeMap<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return 0;
            }
        });

        Student2 st1 = new Student2("Valery", "Blagodarov", 5);
        Student2 st2 = new Student2("Katya", "Katyarina", 2);
        Student2 st3 = new Student2("Yuri", "Melekh", 4);
        Student2 st4 = new Student2("Andrey", "Vozhik", 1);
        Student2 st5 = new Student2("Elena", "Petrik", 2);
        Student2 st6 = new Student2("Nastya", "Smirnova", 5);
        Student2 st7 = new Student2("Evgen", "Bober", 3);
        Student2 st8 = new Student2("Petr", "Bober", 3);

        /* put */
        treeMap.put(st4, 4.1);
        treeMap.put(st7, 6.2);
        treeMap.put(st2, 6.4);
        treeMap.put(st5, 9.3);
        treeMap.put(st3, 5.8);
        treeMap.put(st1, 7.8);
        treeMap.put(st6, 8.7);
        treeMap.put(st8, 6.2);      // затрёт st7, т.к. ключи одинаковые

        System.out.println(treeMap);

        /* descendingMap */
        System.out.println("----------");
        System.out.println(treeMap.descendingMap());    // отображение TreeMap по убыванию

    }

}
