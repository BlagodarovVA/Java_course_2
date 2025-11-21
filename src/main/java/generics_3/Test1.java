package generics_3;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();    // указание <типа> позволяет избежать рантайм ошибок
//        list.add("OK");
//        list.add(8);
//        list.add(new StringBuilder("poiwertiy"));
//        list.add(new Car());

        list.add("privet");
        list.add("poka");
        list.add("OK");
        list.add("fdkjsdoie");


        for (Object item : list){
            System.out.println(item + " - dlina "+ ((String)item).length());
        }
    }

}


class Car{}