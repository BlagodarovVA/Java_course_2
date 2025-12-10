package collection_4.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valery");
        arrayList1.add("Diana");
        arrayList1.add("Marina");
        arrayList1.add("Georg");
        arrayList1.add("Diana");
        System.out.println("arrayList1: " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Valery");
        arrayList2.add("Diana");
        arrayList2.add("Homyak");
        System.out.println("arrayList2: " + arrayList2);

        /* removeAll */
//        arrayList1.removeAll(arrayList2);   // находит элементы из 2 листа в 1 и удаляет
//        System.out.println(arrayList1);

        /* retainAll */
//        arrayList1.retainAll(arrayList2);   // находит элементы из 2 листа в 1 и оставляет только их
//        System.out.println(arrayList1);

        /* containsAll */
        // содержатся ли все элементы из листа 2 в листе 1
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

        /* subList */
        // это не новый объект, а только представление листа
        List<String> myList = arrayList1.subList(2,4);  // с 2 по 4 не включая 4
        System.out.println("subList: " + myList);
        // при изменении изменяется и исходный лист
        myList.add("Privet");
        System.out.println("subList: " + myList);
        System.out.println("arrayList1: " + arrayList1);

//        arrayList1.add("Sveta");
//        System.out.println("subList: " + myList);   // получим ConcurrentModificationException

        /* toArray */
        // массив будет содержать все элементы листа
        Object[] array = arrayList1.toArray();

        String[] strArray = arrayList1.toArray(new String[0]);  // размер будет не 0, а по размеру arrayList1
        for (String s:strArray){
            System.out.println(s);
        }

        System.out.println("----------");
        /* List.of */
        /* List.copyOf */
        List<Integer> list1 = List.of(3, 8, 13);    // нельзя добавлять null
        System.out.println(list1);
//        list1.add(100);                           // нельзя модифицировать лист - UnsupportedOperationException

        List<String> list2 = List.copyOf(arrayList1);   // также нельзя модифицировать и добавлять null
        System.out.println(list2);


    }
}
