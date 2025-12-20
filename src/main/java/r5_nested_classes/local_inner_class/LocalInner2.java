package r5_nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Summ implements Math2{

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Summ s = new Summ();
        System.out.println(s.doOperation(8, 7));

    }
}

interface Math2{
    int doOperation(int a, int b);
}