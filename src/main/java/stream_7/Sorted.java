package stream_7;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {

        int [] array = {5,6,33,7,9,0,21,4,11,3};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
