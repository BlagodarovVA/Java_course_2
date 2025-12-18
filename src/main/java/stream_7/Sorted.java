package stream_7;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {

        int [] array = {5,6,33,7,9,0,21,4,11,3};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array)
                .filter(e -> e%2 == 1)
                .map( e-> {if(e%3 == 0){e = e/3;} return e;})
                .reduce((a,e) -> a+e).getAsInt();
        System.out.println(result);
        // сумма 5 11 7 3 7 11 1
    }
}
