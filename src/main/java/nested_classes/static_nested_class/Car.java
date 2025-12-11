package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static private int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    public static void setA(int a) {
        Car.a = a;
    }

    void method(){
        System.out.println(Engine.countOfEngines);
        Engine e = new Engine("F22A3", 150, 4);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface I {}

    public static class Engine{
        String name;
        private int horsePower;
        int cylinderCount;
        static int countOfEngines;

        public Engine(String name, int horsePower, int cylinderCount) {
            System.out.println(a);
            this.name = name;
            this.horsePower = horsePower;
            this.cylinderCount = cylinderCount;
            countOfEngines++;
        }

        @Override
        public String toString() {
            return "Engine: {" +
                    "name='" + name + '\'' +
                    ", horsePower=" + horsePower +
                    ", cylinderCount=" + cylinderCount +
                    '}';
        }
    }
}


class Test{
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine("k24", 192, 4);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);


    }
}








