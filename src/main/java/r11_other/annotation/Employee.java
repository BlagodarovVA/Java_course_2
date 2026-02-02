package r11_other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// применение аннотации
@MyAnnotaion
public class Employee {

    @MyAnnotaion
    String name;
    double salary;

    @MyAnnotaion
    public Employee(String name, @MyAnnotaion double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotaion
    public void increaseSalary(){
        salary *= 2;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                "}\n";
    }
}


@interface MyAnnotaion{     // создание аннотации

}


@Target({ElementType.METHOD, ElementType.TYPE})     // области применения аннотации метод и класс
@Retention(RetentionPolicy.RUNTIME)                 // SOURCE, CLASS, RUNTIME
@interface MyAnnotaion2{

}














