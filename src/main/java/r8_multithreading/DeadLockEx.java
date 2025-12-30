package r8_multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}


class Thread10 extends Thread{
    public void run(){
        System.out.println("Thread10: Попытка захватить монитор объекта Lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10: Монитор объекта Lock1 захвачен");

            System.out.println("Thread10: Попытка захватить монитор объекта Lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread10: Мониторы объектов Lock1 и Lock2 захвачены");
            }
        }
    }
}


class Thread20 extends Thread{
    public void run(){
        // Чтобы не было дедлоков присинхроне по нескольким объектам,
        // необходим аналогичный порядок захвата в классах, например: lock1, потом lock2
        System.out.println("Thread20: Попытка захватить монитор объекта Lock2");
        synchronized (DeadLockEx.lock2){
            System.out.println("Thread20: Монитор объекта Lock2 захвачен");

            System.out.println("Thread20: Попытка захватить монитор объекта Lock1");
            synchronized (DeadLockEx.lock1){
                System.out.println("Thread20: Мониторы объектов Lock1 и Lock2 захвачены");
            }
        }
    }
}