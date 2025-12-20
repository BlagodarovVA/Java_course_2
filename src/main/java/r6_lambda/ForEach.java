package r6_lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?", "normalno", "poka");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("----------");

        list.forEach(str -> System.out.println(str));
        System.out.println("----------");
        // если сократить еще сильнее
        list.forEach(System.out::println);
        System.out.println("----------");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el -> {
            System.out.println(el);
            el*=2;
            System.out.println(el);
            System.out.println("---");
        });
    }
}
