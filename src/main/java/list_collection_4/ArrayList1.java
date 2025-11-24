package list_collection_4;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
//      ArrayList<String> arrayList1 = new ArrayList<String>(); // Тип в конце можно не указывать
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valery");
        arrayList1.add("Diana");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        // при указании достаточного размера изначально системе не придется его увеличивать пересозданием
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Valery");
        arrayList2.add("Diana");
        System.out.println(arrayList2.size());  // размер листа сейчас 2, а вместимость 200

        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList2); // arrayList4 - новый объект, не равен листу 2
        System.out.println(arrayList4);

        // если не указать тип листа, то можно добавить разные типы, но это плохая практика
        ArrayList arrayList5 = new ArrayList<>();
        arrayList5.add(5);
        arrayList5.add("stroka");
        arrayList5.add('Y');
        System.out.println(arrayList5);

    }
}
