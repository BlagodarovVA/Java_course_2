package r4_collection.thread_safe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentHashMap позволяет избежать конкуренции в сравнении с обычными хешмапами
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Valery");
        map.put(2, "Diana");
        map.put(3, "Misha");
        map.put(4, "Olya");
        map.put(5, "Petr");

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + ": " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Irina");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
