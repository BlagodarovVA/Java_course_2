package stream_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int res = list.stream().reduce((accum, item) ->
                accum * item).get();
        System.out.println(res);
        // 5, 8, 2, 4, 3
        // accum = 5  40  80  320  960
        // item =  8  2   4   3

        int res2 = list.stream().reduce(1, (accum, item) ->     // с доп параметром не будет исключения когда лист пустой
                accum * item);
        System.out.println(res2);
        // accum = 1  5  40  80  320  960
        // item =  5  8   2   4  3

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("ok");
        list3.add("poka");

        String result3 = list3.stream().reduce((a, e) ->
                a + " Э " + e).get();
        System.out.println(result3);



//        List<Integer> list2 = new ArrayList<>();
//        Optional<Integer> o = list2.stream().reduce((accum, item) ->
//                accum * item);
//        if(o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }
    }
}
