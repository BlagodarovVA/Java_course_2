package lambda_6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo2 {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for(Student s:al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
}

class Test3{
    public static void main(String[] args) {
        Student st1 = new Student("Valery", 'm', 24, 4, 7.7);
        Student st2 = new Student("Yuri", 'm', 27, 5, 6.4);
        Student st3 = new Student("Alena", 'f', 21, 2, 8.9);
        Student st4 = new Student("Artem", 'm', 19, 3, 7);
        Student st5 = new Student("Mariya", 'f', 18, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();


        info.testStudents(students, (Student s) -> s.age < 20);
        System.out.println("----------");

        info.testStudents(students, s -> s.avgGrade >= 8);
        System.out.println("----------");

        Predicate<Student> p1 = st -> st.avgGrade >= 7.5;           // переменной можно присвоить лямбда выражение
        Predicate<Student> p2 = st -> st.sex == 'm';

        System.out.println("--- AND ---");
        info.testStudents(students, p1.and(p2));                    // миксование предикатов
        System.out.println("--- OR ---");
        info.testStudents(students, p1.or(p2));
        System.out.println("--- NEGATE ---");
        info.testStudents(students, p1.negate());                   // получим результат НЕ p1

    }
}

