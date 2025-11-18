package L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Valery", "Blagodarov", 7500);
        Employee emp2 = new Employee(50, "Diana", "Blagodarova", 3500);
        Employee emp3 = new Employee(105, "Homyak", "Homyakevich", 500);
        Employee emp4 = new Employee(110, "Homyak", "Frosiy", 500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting:");
        System.out.println(list);

    }
}


class Employee implements Comparable<Employee>{     // делаем класс сравниваемым
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + '\n';
    }

    // метод сравнения
    @Override
    public int compareTo(Employee anotherEmp) {
//        if(this.id > anotherEmp.id) return 1;
//        if(this.id < anotherEmp.id) return -1;
//        return 0;

        // делает то же, меньше текста
//        return Integer.compare(this.id, anotherEmp.id);

        // аналогично
//        return this.id - anotherEmp.id;

        // для String можно так
//        return this.name.compareTo(anotherEmp.name);

        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
