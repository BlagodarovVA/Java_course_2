package r4_collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        /* add */
        arrayList1.add("Valery");
        arrayList1.add("Diana");
        arrayList1.add("Honda");
        arrayList1.add(2, "Hamyakevich");   // добавление на позицию 2(3)
        for (String s:arrayList1){
            System.out.print(s + " ");
        }
        System.out.println();

        // для добавления примитивов (int) необходимо указать тип его wrapper класса
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(7);


        /* get */
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        /* set */
        arrayList1.set(2, "Masha");         // замена элемента по индексу
        System.out.println(arrayList1);

        arrayList1.remove(3);
        System.out.println(arrayList1);
    }
}
