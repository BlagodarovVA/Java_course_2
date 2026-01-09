package r8_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);    // многопоточно
        ExecutorService executorService = Executors.newSingleThreadExecutor();  // 1 поток
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl100());
        }
        // закончить программу при выполнении всех задач
        executorService.shutdown();
        // заставляет ожидать поток, в котором вызывается метод,
        // пока executorService не закончит работу или не пройдет время из параметра
//        executorService.awaitTermination(5, TimeUnit.SECONDS);
//        System.out.println("Main ends");
    }
}


class RunnableImpl100 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}