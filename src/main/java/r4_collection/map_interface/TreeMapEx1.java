package r4_collection.map_interface;

import java.util.TreeMap;

public class TreeMapEx1 {

    public static void main(String[] args) {
        // в TreeMap элементы отсортированы по возрастанию
        // ключи должны быть уникальными
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Valery", "Blagodarov", 5);
        Student st2 = new Student("Katya", "Katyarina", 2);
        Student st3 = new Student("Yuri", "Melekh", 4);
        Student st4 = new Student("Andrey", "Vozhik", 1);
        Student st5 = new Student("Elena", "Petrik", 2);
        Student st6 = new Student("Nastya", "Smirnova", 5);
        Student st7 = new Student("Evgen", "Bober", 3);
        Student st8 = new Student("Petr", "Bober", 3);
        /* put */
        treeMap.put(4.1, st4);
        treeMap.put(6.2, st7);
        treeMap.put(6.4, st2);
        treeMap.put(9.3, st5);
        treeMap.put(5.8, st3);
        treeMap.put(7.8, st1);
        treeMap.put(8.7, st6);
        treeMap.put(6.2, st8);      // затрёт st7, т.к. ключи одинаковые

        System.out.println(treeMap);

        /* get */
        System.out.println("----------");
        System.out.println(treeMap.get(9.3));

        /* remove */
        System.out.println("----------");
        treeMap.remove(4.1);
        System.out.println(treeMap);

        /* descendingMap */
        System.out.println("----------");
        System.out.println(treeMap.descendingMap());    // отображение TreeMap по убыванию

        /* tailMap */
        System.out.println("----------");
        System.out.println(treeMap.tailMap(7d));        // оставить с ключом больше 7

        /* headMap */
        System.out.println("----------");
        System.out.println(treeMap.headMap(7d));        // оставить с ключом меньше 7

        /* lastEntry */
        System.out.println("----------");
        System.out.println(treeMap.lastEntry());        // последний элемент коллекции

        /* firstEntry */
        System.out.println("----------");
        System.out.println(treeMap.firstEntry());        // первый элемент коллекции
    }

}
