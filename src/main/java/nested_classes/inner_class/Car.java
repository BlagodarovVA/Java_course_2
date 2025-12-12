package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    // в конструктор добавляем параметры вложенного класса Engine
    public Car(String color, int doorCount/*, String name, int horsePower, int cylinderCount*/) {
        Engine e = new Engine("d15b", 125, 4);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
        // создаем двигатель в конструкторе. Особенность Inner class
//        this.engine = this.new Engine(name, horsePower, cylinderCount);
    }

    // альтернативный способ добавления двигателя
    public void setEngine(Engine engine){
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        String name;
        private int horsePower;
        int cylinderCount;

        public Engine(String name, int horsePower, int cylinderCount) {
            this.name = name;
            this.horsePower = horsePower;
            this.cylinderCount = cylinderCount;
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

//        Car.Engine engine = new Car.Engine("k24", 192, 4);

//        Car car = new Car("black", 4, "F22A3", 150, 4);

        // альтернативный способ добавления двигателя
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine("K24A3", 190, 4);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        // альтернативный способ добавления двигателя
        Car.Engine engine1 = new Car("red", 3).new Engine("G12T", 110, 4);
        System.out.println(engine1);

    }
}
