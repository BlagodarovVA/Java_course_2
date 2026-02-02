package r11_other.annotation;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Valery");
        p.showInfo();

    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo(){
        System.out.println("Parent class: " + name);
    }
}


class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    @Override           // аннотация перезаписи метода
    @Deprecated         // метод устарел
    void showInfo(){
        System.out.println("Child class: " + name);
    }
}