package L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Valery");
        list.add("Diana");
        list.add("Homyakevich");
        System.out.println("Not sorted");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted");
        System.out.println(list);
    }
}
