package r4_collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Valery", 5);
        Student st2 = new Student("Katya", 2);
        Student st3 = new Student("Yuri", 4);
        Student st4 = new Student("Andrey", 1);
        Student st5 = new Student("Elena", 3);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println(treeSet);
        System.out.println("----------");

        System.out.print("first record - " + treeSet.first());
        System.out.print("last record - " + treeSet.last());
        // получим записи со значениями сравниваемого параметра (курс в данном случае) меньше
        Student st6 = new Student("Irina", 2);
        System.out.println("headSet - " + treeSet.headSet(st6));
        System.out.println("----------");
        // получим записи со значениями сравниваемого параметра (курс в данном случае) больше
        System.out.println("tailSet - " + treeSet.tailSet(st6));

        Student st7 = new Student("Ivan", 4);
        System.out.println("курс ниже чем у st7 и >= чем у st6 - " + treeSet.subSet(st6, st7));

        System.out.println("st2.equals(st6): " + st2.equals(st6));
        System.out.println("st2.hashCode == st6.hashCode: " + (st2.hashCode() == st6.hashCode()));
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