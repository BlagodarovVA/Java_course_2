package r4_collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valery");
        arrayList1.add("Diana");
        arrayList1.add("Marina");
        arrayList1.add("Georg");
        arrayList1.add("Diana");
        System.out.println("arrayList1: " + arrayList1);

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.next();            // получаем элемент

            if(iterator.next() == "Marina"){
                iterator.remove();          // удаляем элемент
            }
        }
        System.out.println("arrayList1: " + arrayList1);
    }
}
