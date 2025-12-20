package r6_lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestSupplierConsumer {
    // метод-поставщик создает и возвращает объекты с переданными параметрами
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier, int qty){
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < qty; i++) {
            al.add(carSupplier.get());
        }
        return  al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }


    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "silver", 1.6), 3);
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.getFirst(), car -> {
            car.model = "Honda";
            car.engine = 2.4;
            System.out.println("upgraded car: " + car);
        });
        System.out.println("Our cars: " + ourCars);
    }
}


class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}' + '\n';
    }
}