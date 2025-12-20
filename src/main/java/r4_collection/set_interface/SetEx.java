package r4_collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

        // Set - коллекция хранит только уникальные элементы
        // методы Set очень быстрые
        Set<String> set = new HashSet<>();

        /* add */
        set.add("Valery");
        set.add("Diana");
        set.add("Michail");
        set.add("Elena");
        set.add("Elena");   // дубликаты не добавятся
        set.add(null);      // null можно добавить

        /* remove */
        set.remove(null);

        /* size */
        System.out.println("размер - " + set.size());

        /* isEmpty */
        System.out.println("пустой - " + set.isEmpty());

        /* contains */
        System.out.println("содержит Zina - " + set.contains("Zina"));

        System.out.println(set);

        for(String s: set){
            System.out.println(s);
        }
    }
}
