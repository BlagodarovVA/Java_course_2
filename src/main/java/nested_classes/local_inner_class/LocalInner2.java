package nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Summ implements Math2{

            @Override
            public int dooperation(int a, int b) {
                return a + b;
            }
        }
        Summ s = new Summ();
        System.out.println(s.dooperation(8, 7));

    }
}

interface Math2{
    int dooperation(int a, int b);
}