package r7_stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {

        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(item -> {
            item *= 2;
            System.out.println(item);
        });
        System.out.println("----------");

        // метод референс - сокращение записи
        // каждый элемент подставится в метод println
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("----------");

        // пример попроще
        // каждый элемент потока поместить в метод myMethod в качестве параметра
        Arrays.stream(array).forEach(Utils::myMethod);
        System.out.println("----------");
    }
}

class Utils{
    public static void myMethod(int a){
        a = a + 5;
        System.out.println("Element = " + a);
    }
}

