package r3_generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(55);
//        System.out.println(info2);
//        Integer i1 = info2.getValue();
//
//        InfoExt<Double> info3 = new InfoExt<>(3.14);
//        System.out.println(info3);
//        Double d1 = info3.getValue();
    }

//    public void abc(Info<String> info){     // для jvm эти 2 метода одинаковы - abc(Info info), поэтому вместе не могут работать
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}

class Info <T>{                 // T - type placeholder
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

//class InfoExt <T extends Number&I1&I2> {        // имплементируем 2 интерфейса к T
class InfoExt <T extends Number> {                // установка T только числовым
    private T value;

    public InfoExt(T value) {
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

interface I1{}

interface I2{}

class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

class Child extends Parent{
    // так тоже нельзя оверрайдить, т.к. при компиляции стирается инфа о дженериках
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}


