package collection_4.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);                             // поиск не найдет, т.к. массив не сортирован
        Collections.sort(arrayList);
        index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(arrayList);
        System.out.println(index1);
        System.out.println(Collections.binarySearch(arrayList, 120));

        /* reverse */
        Collections.reverse(arrayList);     // перевернуть массив задом наперед
        System.out.println(arrayList);
        /* shuffle */
        Collections.shuffle(arrayList);     // перемешать массив
        System.out.println(arrayList);



        System.out.println("--------------------");
        Employee employee1 = new Employee(100, "Valery", 6542);
        Employee employee2 = new Employee(125, "Diana", 2878);
        Employee employee3 = new Employee(15, "Petr", 3215);
        Employee employee4 = new Employee(182, "Mihail", 4823);
        Employee employee5 = new Employee(15, "Sveta", 7319);
        Employee employee6 = new Employee(200, "Ivan", 4972);
        Employee employee7 = new Employee(125, "Maria", 1679);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);

        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Mihail", 111));
        System.out.println(index2);     // поиск найдет, хотя ЗП не совпадает, т.к. метод сравнения не учитывает ЗП

        System.out.println("--------------------");
        int [] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, -3);
        System.out.println(index3);

    }
}



class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}' + '\n';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = Integer.compare(this.id, anotherEmp.id);
        if(result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}

