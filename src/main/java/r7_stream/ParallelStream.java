package r7_stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream()
                .reduce((acc, el) -> acc + el)
                .get();
        System.out.println("sumResult = " + sumResult);

        // parallelStream можно использовать, где не важен порядок действий
        double sumResult_parallel = list.parallelStream()
                .reduce((acc, el) -> acc + el)
                .get();
        System.out.println("sumResult_parallel = " + sumResult_parallel);

        double divResult = list.stream()
                .reduce((acc, el) -> acc / el)
                .get();
        System.out.println("divResult = " + divResult);
    }
}
