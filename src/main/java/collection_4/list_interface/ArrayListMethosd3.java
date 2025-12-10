package collection_4.list_interface;

import java.util.ArrayList;

public class ArrayListMethosd3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valery");
        arrayList1.add("Diana");
        arrayList1.add("Horosho");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        /* addAll */
        arrayList1.addAll(arrayList2);          // добавляем все элементы листа 2 в конец листа 1
        System.out.println(arrayList1);

        arrayList1.addAll(2, arrayList2);      // добавляем все элементы листа 2 с 1 позиции листа 1
        System.out.println(arrayList1);

        /* clear */
//        arrayList1.clear();                     // очистка листа
        System.out.println(arrayList1);

        /* indexOf */
        System.out.println("Индекс первого найденного объекта: " + arrayList1.indexOf("???"));

        /* lastIndexOf */
        System.out.println("Индекс последнего найденного объекта: " + arrayList1.lastIndexOf("???"));

        /* size */
        System.out.println("Размер массива: " + arrayList1.size());

        /* isEmpty */
        System.out.println("Массив пустой: " + arrayList1.isEmpty());

        /* contains */
        // Метод также зависим от переопределения equals для ссылочных объектов
        System.out.println("Массив содержит объект: " + arrayList1.contains("Valery"));

        /* toString() */
        // При выводе на экран (sout) преобразование в строку автоматическое
        System.out.println(arrayList1.toString());  // toString - избыточное использование

    }
}
