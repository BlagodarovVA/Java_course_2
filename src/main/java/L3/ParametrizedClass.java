package L3;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(55);
        System.out.println(info2);
        Integer i1 = info2.getValue();
    }
}

class Info <T>{         // T - type placeholder
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{ " + value + " }";
    }

    public T getValue() {
        return value;
    }
}