package r8_multithreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker());
        System.out.println("State - " + thread.getState());      // получить состояние
        thread.start();
        System.out.println("State - " + thread.getState());

//        thread.join(1000);      // ожидание или завершения потока, или 1 сек
        thread.join();
        System.out.println("State - " + thread.getState());
        System.out.println("Main ends");
    }
}


class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}
