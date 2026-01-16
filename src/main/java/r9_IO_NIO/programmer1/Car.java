package r9_IO_NIO.programmer1;

import java.io.Serial;
import java.io.Serializable;

public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = 1; // для обозначения версии класса

    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return '{' +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
