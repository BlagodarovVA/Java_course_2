package r11_other.reflection;

public class Employee {
    public int id;
    public String name;
    public String department;
    private double salary;

    public Employee() { }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDepartment(String newDep){
        department = newDep;
        System.out.println("New department is: " + newDep);
    }

    public void increaseSalary(){
        salary *= 2;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                "}\n";
    }
}
