package r9_IO_NIO.programmer1;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable { // Serializable - позволяет сериализировать класс
    @Serial
    private static final long serialVersionUID = 2; // для обозначения версии класса

    String name;
    String surname;
    String department;
//    int age;
    transient double salary;    // transient - не позволит записать в файл поле при сериализации
    Car car;

    public Employee(String name,
                    String surname,
                    String department,
//                    int age,
                    double salary,
                    Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                "}\n";
    }
}
