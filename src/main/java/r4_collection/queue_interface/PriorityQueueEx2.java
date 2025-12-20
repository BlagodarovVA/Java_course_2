package r4_collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Valery", 5);
        Student st2 = new Student("Katya", 2);
        Student st3 = new Student("Yuri", 4);
        Student st4 = new Student("Andrey", 1);
        Student st5 = new Student("Elena", 3);

        PriorityQueue<Student> pq2 = new PriorityQueue<>();
        pq2.add(st1);
        pq2.add(st2);
        pq2.add(st3);
        pq2.add(st4);
        pq2.add(st5);
        System.out.println(pq2);    // при выводе на экран сортировки нет, при использовании есть

        System.out.println("----- удаление -----");
        System.out.print(pq2.poll());
        System.out.print(pq2.poll());
        System.out.print(pq2.poll());
        System.out.print(pq2.poll());
        System.out.print(pq2.poll());
    }
}


class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", course=" + course +
                "}\n";
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}