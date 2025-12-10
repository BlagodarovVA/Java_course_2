package collection_4.list_interface;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {

        Student2 st1 = new Student2("Vlad", 5);
        Student2 st2 = new Student2("Vadim", 4);
        Student2 st3 = new Student2("Alex", 3);
        Student2 st4 = new Student2("Nastya", 2);
        Student2 st5 = new Student2("Arina", 1);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        /* add */
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList:\n" + student2LinkedList);
        /* get */
        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Pasha", 1);
        Student2 st7 = new Student2("Katya", 0);
        student2LinkedList.add(st6);                // добавление в конец
        student2LinkedList.add(1, st7);             // добавление по индексу
        System.out.println("LinkedList:\n" + student2LinkedList);

        /* remove */
        student2LinkedList.remove(3);               // удаление по индексу
        System.out.println("LinkedList:\n" + student2LinkedList);

        // поиск работает быстрее в ArrayList
        // добавление и удаление быстрее в LinkedList, особенно в начало коллекции
    }
}

class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}' + '\n';
    }
}