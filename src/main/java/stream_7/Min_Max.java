package stream_7;

import java.util.ArrayList;
import java.util.List;

public class Min_Max {
    public static void main(String[] args) {
        Student st1 = new Student("Valery", 'm', 24, 4, 7.7);
        Student st2 = new Student("Yuri", 'm', 27, 5, 8.2);
        Student st3 = new Student("Alena", 'f', 21, 2, 7.3);
        Student st4 = new Student("Artem", 'm', 19, 3, 6.4);
        Student st5 = new Student("Nastya", 'f', 18, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student minAge = students.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(minAge);

        Student maxAge = students.stream().max((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(maxAge);
    }
}


