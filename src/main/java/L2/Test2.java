package L2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Valery", "Blagodarov", 7500);
        Employee emp2 = new Employee(50, "Diana", "Blagodarova", 3500);
        Employee emp3 = new Employee(105, "Homyak", "Homyakevich", 300);
        Employee emp4 = new Employee(110, "Homyak", "Frosiy", 200);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting:");
        System.out.println(list);
//        Collections.sort(list);               // Comparable

        list.sort(new IdComparator());          // Comparator - id
        System.out.println("After sorting id:");
        System.out.println(list);
        System.out.println("After sorting name:");
        list.sort(new NameComparator());        // Comparator - name
        System.out.println(list);
        System.out.println("After sorting salary:");
        list.sort(new SalaryComparator());      // Comparator - salary
        System.out.println(list);

    }
}


class Employee
//        implements Comparable<Employee>     // делаем класс сравниваемым
{
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
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        if(this.id > anotherEmp.id) return 1;
//        if(this.id < anotherEmp.id) return -1;
//        return 0;

        // делает то же, меньше текста
//        return Integer.compare(this.id, anotherEmp.id);

        // аналогично
//        return this.id - anotherEmp.id;

        // для String можно так
//        return this.name.compareTo(anotherEmp.name);

//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
//    }

}


class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.id, emp2.id);
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.name.compareTo(emp2.name);
        if (res == 0) {
            res = emp1.surname.compareTo(emp2.surname);
        }
        return res;
    }
}

class SalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
