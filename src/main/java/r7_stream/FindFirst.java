package r7_stream;

import java.util.ArrayList;
import java.util.List;

public class FindFirst {
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

        /* findFirst */
        // берет первую запись из мапы
        Student first = students.stream().map(item ->
                {
                    item.setName(item.getName().toUpperCase());
                    return item;})
                .filter(item -> item.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);
    }
}
