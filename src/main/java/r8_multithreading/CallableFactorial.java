package r8_multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(7);
        // вместо метода execute - submit, он возвращает результат задачи
        Future<Integer> future = executorService.submit(factorial2);
        try {
            factorialResult = future.get();     // get() - возвращает результат нужного нам типа
        } catch (InterruptedException e) {      // исключение может вернуть метод call()
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();         // лучше закрывать через finally
        }

        System.out.println("Результат: " + factorialResult);
    }
}


// Callable - имеет возвращаемый тип и может выбрасывать исключения
class Factorial2 implements Callable<Integer>{
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if(f <= 0){
            throw new Exception("Вы ввели не верное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}