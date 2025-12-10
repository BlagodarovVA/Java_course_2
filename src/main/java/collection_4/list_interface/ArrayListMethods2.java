package collection_4.list_interface;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student student1 = new Student("Vadim", 'm', 20, 5, 7.9);
        Student student2 = new Student("Tatiana", 'f', 21, 4, 8.6);
        Student student3 = new Student("Andrey", 'm', 22, 3, 7.1);
        Student student4 = new Student("Elena", 'f', 23, 2, 6.4);
        Student student5 = new Student("Karina", 'f', 21, 2, 9.1);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);

        /* remove */
        Student student6 = new Student("Karina", 'f', 21, 2, 9.1);
        // не удалится, т.к. нет в листе объекта с таким адресом
        // если переопределить метод equals, то удалится
//        studentList.remove(student6);
        System.out.println(studentList);

        /* indexOf */
        // поиск позиции элемента
        // отработает, если переопределен метод equals
        int index = studentList.indexOf(student6);
        System.out.println("Индекс найденного объекта: " + index);
    }
}


class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(avgGrade, student.avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}' + '\n';
    }
}
