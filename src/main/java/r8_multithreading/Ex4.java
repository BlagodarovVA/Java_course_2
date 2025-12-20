package r8_multithreading;

public class Ex4 {
    public static void main(String[] args) {
        // создание и запуск потока без класса, который его имплементирует
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();

        // создание и запуск потока - еще меньше текста
        new Thread(() -> System.out.println("privet")).start();
    }
}
