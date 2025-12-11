package collection_4.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Honda");
        queue.add("Audi");
        queue.add("GMC");
        queue.add("VW");
        // если очередь ограничена, то при добавлении сверх размера с помощью add получим исключение
        // при добавлении сверх размера с помощью offer исключения не будет, просто элемент не добавится
        queue.offer("Geely");

        System.out.println(queue);

        // без аргумента удалится первый элемент
        // если удалять нечего, будет исключение
        System.out.println(queue.remove());
        // можно удалить из середины, но для этого лучше использовать другие коллекции, т.к. суть queue - очередь
        System.out.println(queue.remove("GMC"));

        // удаление элемента. Не вызовет исключения, если нЕчего удалять
        System.out.println(queue.poll());

        // если очередь пуста, получим исключение
        System.out.println("Верхний элемент в очереди: " + queue.element());
        // если очередь пуста, не будет исключения
        System.out.println("Верхний элемент в очереди: " + queue.peek());


        System.out.println(queue);



    }
}
