package r3_generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondEl(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("asalam aleykum");
        al2.add("konichiva");
        al2.add("shalom");
        String s = GenMethod.getSecondEl(al2);
        System.out.println(s);
    }
}

class GenMethod{
    public static <T> T getSecondEl(ArrayList<T> al) {
        return al.get(1);
    }
}