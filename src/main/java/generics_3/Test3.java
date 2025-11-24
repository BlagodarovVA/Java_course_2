package generics_3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        // wildcard. вместо ? может стоять любой тип
        //List<?> - супертип для любого типа  ArrayList
        List<?> list = new ArrayList<Integer>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(14);
        list1.add(-20);
        List<String> list2 = new ArrayList<>();
        list2.add("Ok");
        list2.add("Good");
        list2.add("Bad");
        showListInfo(list1);
        showListInfo(list2);

        // bounded wildcard
        // можно использовать сам класс или его дочерние
        List<? extends Number> list3 = new ArrayList<Integer>();

        // можно использовать сам класс или его родительские
        // распространено реже
        List<? super Number> list4 = new ArrayList<Number>();

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(8.7);
        ald.add(14.06);
        ald.add(-20.4);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(8);
        ali.add(14);
        ali.add(-20);
        System.out.println(summ(ali));

    }

    // List<?> применяется для обработки разных типов листов
    static void showListInfo(List<?> list){
        System.out.println(list);
    }

    public static double summ(ArrayList<? extends Number> al){
        double summ = 0;
        for (Number n:al){
            summ += n.doubleValue();
        }
        return summ;
    }
}
