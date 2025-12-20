package r6_lambda;

public class Test1 {
    static void def(I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
        // строку выше можно упростить строкой:
        def(String::length);
    }
}

interface I {
    int abc(String s);
}