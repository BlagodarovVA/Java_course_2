package collection_4.set_interface;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(8);

        /* addAll - добавление всех без дублей */
        HashSet<Integer> union = new HashSet<>(hashSet1);   // добавление первого сета
        union.addAll(hashSet2);
        System.out.println(union);

        /* retainAll - останутся общие элементы из обоих множеств */
        HashSet<Integer> intersect = new HashSet<>(hashSet1);   // добавление первого сета
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        /* retainAll - останутся элементы из 1 множества, которых нет во 2  */
        HashSet<Integer> subtract = new HashSet<>(hashSet1);   // добавление первого сета
        subtract.removeAll(hashSet2);
        System.out.println(subtract);

    }
}
