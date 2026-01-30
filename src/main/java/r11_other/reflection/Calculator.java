package r11_other.reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Calculator {
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Сумма: " + result);
    }

    void subtraction(int a, int b){
        int result = a - b;
        System.out.println("Разница: " + result);
    }

    void multiplication(int a, int b){
        int result = a * b;
        System.out.println("Произведение: " + result);
    }

    void division(int a, int b){
        int result = a / b;
        System.out.println("Частное: " + result);
    }
}


class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\Java_repos\\Java_course_2\\src\\main\\java\\r11_other\\reflection\\test100.txt"))){
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();
            for (Method myMethod:methods){
                if(myMethod.getName().equals(methodName)){
                    method = myMethod;
                }
            }

            Objects.requireNonNull(method).invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));


        } catch (IOException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}










