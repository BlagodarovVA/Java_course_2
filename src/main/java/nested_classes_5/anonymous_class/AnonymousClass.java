package nested_classes_5.anonymous_class;

public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {
        // анонимный класс - объявление класса и одновременное создание объекта
        // в анонимных классах нет конструктора
        Math m = new Math() {
            int c = 10;
            void abc(){}
            @Override
            public int doOperation(int a, int b) {
                // анонимный класс может обращаться к private элементам внешнего класса
                // для этого нужно создать объект внешнего класса
                AnonymousClass ac = new AnonymousClass();
                return a + b + ac.x;
            }
        };      // одно выражение, поэтому нужна точка с запятой

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(m.doOperation(5, 7));
        System.out.println(m2.doOperation(5, 7));
    }
}



interface Math{
    int doOperation(int a, int b);
}