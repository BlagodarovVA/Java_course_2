package r10_RegEx;

public class PrintfEx {

    static void employeeInfo(Employee emp){
        /* d - целые числа
        * 3 - кол-во символов для id
        * 0 - незаполненные места заполняются нулями
        *
        * s - string
        * 12 - кол-во символов для name
        * - выравнивание по левой стороне
        *
        * f - float
        * .1 - округление до 1 символа после запятой
        * , - разделитель разрядов в числах
        * */

        System.out.printf("%03d \t %-10s \t %-10s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Valery", "Blagodarov", 5001, 0.15);
        Employee e2 = new Employee(2, "Diana", "Blagodarova", 2003, 0.20);
        Employee e3 = new Employee(3, "Pepa", "Homyakova", 204, 0.12);

//        employeeInfo(e1);
//        employeeInfo(e2);
//        employeeInfo(e3);

        String newStr = String.format("%03d: \t %-10s \t %-10s \t %,.1f$ \n",
                1, "Valery", "Blagodarov", 5001*(1+0.15));
        System.out.println(newStr);
    }
}


class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}