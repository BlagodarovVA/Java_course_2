package collection_4.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        // ключом в Map должен быть imutable объект
        // иначе при изменении атрибутов изменится и hashCode в мапе
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Valery", "Blagodarov", 5);
        Student st2 = new Student("Katya", "Ivanova", 2);
        Student st3 = new Student("Yuri", "Melekh", 4);
        map.put(st1, 8.5);
        map.put(st2, 9.3);
        map.put(st3, 7.9);
        System.out.println(map);

        Student st4 = new Student("Valery", "Blagodarov", 5);
        Student st5 = new Student("Artem", "Plisko", 3);
        boolean result = map.containsKey(st4);                  // false, пока не переопределен hashCode и equals
        System.out.println("result = " + result);
        System.out.println(st1.equals(st4));                    // true

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        /* entrySet */
        for (Map.Entry<Student, Double> entry:map.entrySet()){
            System.out.print(entry.getKey() + ":" + entry.getValue());
        }

        // параметрами указаны начальный размер и
        // коэффициент заполнения до удвоения размера
        Map<Integer, String> map2  = new HashMap<>(16, 0.75F);  // 16 и 0,75 - значения по умолчанию


    }
}



final class Student{
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "\n {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

//    @Override
//    public int hashCode() {
//        return name.length()*7 +  surname.length()*11 +  course*53;     // плохая реализация
//    }

}

final class Student2 implements Comparable<Student2>{
    final String name;
    final String surname;
    final int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "\n {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student2 student = (Student2) object;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }
}