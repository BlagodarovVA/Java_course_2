package list_collection_4.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx1 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        /* put */
        map1.put(1000, "Valery Blagodarov");
        map1.put(6548, "Diana Schneider");
        map1.put(2496, "Mihail Petrov");
        map1.put(1264, "Ekaterina Sidorova");
        map1.put(4567, "Ekaterina Sidorova");
        map1.put(2496, "Elena Buran");          // заменит запись с таким же ключом
        map1.put(null, "Boris Elcin");
        map1.put(8877, null);

        /* putIfAbsent */
        map1.putIfAbsent(1000, "Ekaterina Sidorova");   // добавить, если такого нет, проверка ключа
        System.out.println(map1);

        /* get */
        System.out.println(map1.get(6548));             // получение по ключу

        /* remove */
        map1.remove(1264);                              // удаление по ключу
        System.out.println(map1);

        /* containsValue */
        System.out.println(map1.containsValue("Valery Blagodarov"));    // проверка, что существует значение

        /* containsKey */
        System.out.println(map1.containsKey(5555));     // проверка, что существует ключ

        /* keySet */
        System.out.println(map1.keySet());              // возвращает все ключи
        
        /* values */
        System.out.println(map1.values());              // возвращает все значения
    }
}
