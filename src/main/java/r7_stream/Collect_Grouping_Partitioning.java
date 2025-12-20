package r7_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect_Grouping_Partitioning {
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

        // имена приведены к верхнему регистру, сгруппированы по курсу
        // группировка по ключу мапы, групп может быть сколько угодно
        Map<Integer, List<Student>> map = students.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        })
                .collect(Collectors.groupingBy(Student::getCourse));

//        System.out.println(students);
//        System.out.println("----------");
//        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        // partitioningBy - делит элементы на две группы на основе булевого предиката
        Map<Boolean, List<Student>> map2 =
                students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        System.out.println(students);
        System.out.println("----------");
        for (Map.Entry<Boolean, List<Student>> entry: map2.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }







    }
}
