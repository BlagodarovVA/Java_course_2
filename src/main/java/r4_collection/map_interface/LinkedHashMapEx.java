package r4_collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {

        // Параметры:
        // 16 - размер,
        // 0.75f - предел наполнения для удвоения размера,
        // true/false - порядок вывода от использования или добавления
        // после использования элемент становится последним в листе
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Valery", "Blagodarov", 5);
        Student st2 = new Student("Katya", "Katyarina", 2);
        Student st3 = new Student("Yuri", "Melekh", 4);
        Student st4 = new Student("Andrey", "Vozhik", 1);

        linkedHashMap.put(4.1, st1);
        linkedHashMap.put(6.2, st2);
        linkedHashMap.put(6.4, st3);
        linkedHashMap.put(9.3, st4);

        System.out.println(linkedHashMap);
        System.out.println("----------");

        System.out.print(linkedHashMap.get(6.2));
        System.out.println(linkedHashMap.get(4.1));
        System.out.println("----------");

        System.out.println(linkedHashMap);

    }
}
