package r11_other.reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Valery", "IT");
        Class empClass = employee.getClass();
        Field field = empClass.getDeclaredField("salary");

        field.setAccessible(true);              // даем доступ к полю даже если оно private
        double salaryVal = (double) field.get(employee);
        System.out.println(salaryVal);
//        field.setAccessible(false);

        field.set(employee, 1500);              // изменение поля private
        System.out.println(employee);
    }
}

