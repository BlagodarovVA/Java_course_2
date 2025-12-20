package r7_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    // отчекрыживаем окружающие квадратные скобки
    static String removeSq(List<Student> list){
        return list.toString().substring(1, list.toString().length() - 1);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Valery", 'm', 24, 4, 7.7);
        Student st2 = new Student("Yuri", 'm', 27, 5, 6.4);
        Student st3 = new Student("Alena", 'f', 21, 2, 8.9);
        Student st4 = new Student("Artem", 'm', 19, 3, 7);
        Student st5 = new Student("Mariya", 'f', 18, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().map(item ->
            {
                item.setName(item.getName().toUpperCase());
                return item;})
                .filter(item -> item.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);
        System.out.println("----------");


        // сортировка по имени
        students = students.stream().sorted((x,y) ->
                x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        System.out.println(removeSq(students));

        students = students.stream().filter(item ->
                item.getAge()>22 && item.getAvgGrade() < 8).toList();

        System.out.println(removeSq(students));

//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//        myStream.filter(item ->
//                item.getAge()>22 && item.getAvgGrade() < 8).toList();
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
    public String toString() {
        return "{" +
                "naame='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}' + '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}