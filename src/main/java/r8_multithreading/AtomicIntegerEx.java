package r8_multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);    // не требует синхронизации

//    public synchronized static void increment(){    // synchronized исключает datarace
//        counter++;
    public static void increment(){
        /*
        * incrementAndGet - увеличить затем вернуть
        * getAndIncrement - вернуть и увеличить
        * addAndGet       - добавить число и вернуть
        * getAndAdd       - вернуть и добавить число
        * decrementAndGet - уменьшить затем вернуть
        * getAndDecrement - вернуть и уменьшить
        */

        counter.incrementAndGet();
//        counter.addAndGet(5);   // увеличение на 5
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp18());
        Thread thread2 = new Thread(new MyRunnableImp18());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}


class MyRunnableImp18 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            AtomicIntegerEx.increment();
        }
    }
}

