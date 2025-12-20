package r7_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {
    public static void main(String[] args) {
        Student st1 = new Student("Valery", 'm', 24, 4, 7.7);
        Student st2 = new Student("Yuri", 'm', 27, 5, 8.2);
        Student st3 = new Student("Alena", 'f', 21, 2, 7.3);
        Student st4 = new Student("Artem", 'm', 19, 3, 6.4);
        Student st5 = new Student("Nastya", 'f', 18, 1, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())     // mapToDouble - для double...
                .boxed()                            // конвертирует int в Integer
                .collect(Collectors.toList());
        System.out.println(courses);

        /* sum */
        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        /* average */
        double avg = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(avg);

        /* min */
        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min);

        /* max */
        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max);

    }
}
