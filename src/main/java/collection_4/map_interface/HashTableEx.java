package collection_4.map_interface;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {

        // устаревший тип, лучше не использовать
        // является synchronized, медленнее чем HashMap
        Hashtable<Double, Student> ht = new Hashtable<>();

        Student st1 = new Student("Valery", "Blagodarov", 5);
        Student st2 = new Student("Katya", "Katyarina", 2);
        Student st3 = new Student("Yuri", "Melekh", 4);
        Student st4 = new Student("Andrey", "Vozhik", 1);

        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.7, st3);
        ht.put(6.0, st4);

//        ht.put(6.6, null);      // нельзя добавить с ключом или значением null

        System.out.println(ht);
    }
}
