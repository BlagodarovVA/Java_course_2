package stream_7;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        // stream и его методы не меняют исходную коллекцию или массив
        // 6 9 2 4
        List<Integer> list2 = list.stream().map(item -> item.length()).toList();

        System.out.println(list);
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array).map(item -> {
            if(item%3 == 0){
                item = item / 3;
            }
            return item;
        }).toArray();
        // 5 3 1 8 1
        System.out.println(Arrays.toString(array));

        System.out.println("----------");
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");
        System.out.println(set);

        Set<Integer> set2 =  set.stream().map(e -> e.length()).collect(Collectors.toSet());
        // 2 4 6 9
        System.out.println(set2);
    }
}
