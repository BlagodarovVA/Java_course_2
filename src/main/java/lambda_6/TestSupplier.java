package lambda_6;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TestSupplier {
    // метод-поставщик создает и возвращает объекты с переданными параметрами
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier, int qty){
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < qty; i++) {
            al.add(carSupplier.get());
        }
        return  al;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "silver", 1.6), 3);
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