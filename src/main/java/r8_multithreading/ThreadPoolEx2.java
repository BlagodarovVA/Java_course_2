package r8_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }

        // метод выполнит задания через 3 сек
//        System.out.println("Ждём 3 секунды...");
//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);

        /*
        * планирует задачу для периодического выполнения.
        * первый раз - с задержкой 2 парам., потом - с периодом 3 парам., 4 пар. - единица измерения
        * таймаут считается от начала 1 до начала следующего задания
        * если задание работает дольше таймаута, то следующее стартует сразу
        */
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);

        /* аналогично предыдущему, но задержка между заданиями фиксированная
        * время считается с конца выполнения одного задания до начала второго */
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);


        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        // Кешированный тредпул
        // создает треды, только если все заняты. Если есть свободные, переиспользует
        // Если тред не используется 60 сек, то удаляется
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}


class RunnableImpl200 implements Runnable{

    @Override
    public void run() {
        System.out.println("Хоба: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ends work: " + Thread.currentThread().getName());
    }
}