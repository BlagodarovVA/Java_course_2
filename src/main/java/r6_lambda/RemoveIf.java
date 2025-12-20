package r6_lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim java");
        al.add("A imenno lambdas");
        System.out.println(al);

        al.removeIf(item -> item.length() < 5);
        // то же самое, только длиннее
        Predicate<String> p = item -> item.length() < 5;
        al.removeIf(p);

        System.out.println(al);

    }
}
