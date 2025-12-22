package r8_multithreading;

public class VolatileEx extends Thread{
    // volatile - обеспечивает видимость изменений между потоками
    // когда только один поток меняет значение, другие читают
    // и запрещает некоторые оптимизации, которые могут нарушить
    volatile boolean b = true;

    public void run(){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(1000);
        System.out.println("After 3 sec it is time to wake up!");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}
