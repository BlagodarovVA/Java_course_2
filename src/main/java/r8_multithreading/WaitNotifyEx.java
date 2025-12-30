package r8_multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}


class Market{
    private int breadCount = 0;
    private final Object lock = new Object();

    public synchronized void getBread(){
//        synchronized (lock){
            while (breadCount < 1){
                try {
                    // Если с параметром, то такая длительность ожидания
                    // если notify не сработает быстрее
                    wait(1000);                   // ожидание
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Куплена 1 буханка хлеба");
            System.out.println("Остаток в магазине: " + breadCount);
            notify();           // сообщение, чо количество уменьшилось
//          this.notify();      // можно писать так
//          lock.notify();      // если синхронизация блока кода, то wait/notify через объект lock
//        }
    }

    public synchronized void putBread(){
        while (breadCount >= 5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Запасы пополнены на 1 хлеб");
        System.out.println("Остаток в магазине: " + breadCount);
    }
}


class Producer implements Runnable{
    Market market;
    public Producer(Market market) {
        this.market = market;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}


class Consumer implements Runnable{
    Market market;
    public Consumer(Market market) {
        this.market = market;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}


