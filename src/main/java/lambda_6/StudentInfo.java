package lambda_6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for(Student s:al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
// так себе практика
//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s: al){
//            if(s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s: al){
//            if(s.age < age){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s: al){
//            if(s.age>age && s.avgGrade<grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }
}

class Test{
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

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });

        // сокращенно, сортировка с помощью лямбда выражения
//        students.sort((stud1, stud2) -> stud1.course - stud2.course);
//
//        System.out.println(students);
//        System.out.println("----------");


        /* самый короткий вариант заменить лямбдой
          стрелка разделяет параметры метода и тело метода
          если параметров больше чем 1 или указывается тип - нужны скобки
          если в теле несколько стейтментов, нужен полный вариант
         */
        info.testStudents(students, (Student s) -> {
            //System.out.println("hello");
            return s.age < 20;
        });
        System.out.println("----------");

        info.testStudents(students, s -> s.avgGrade >= 8);              // самый короткий способ написания лямбды
        System.out.println("----------");

        // переменной можно присвоить лямбда выражение
//        StudentChecks sc = s -> s.avgGrade >= 8;
//        info.testStudents(students, sc);            // переменная вместо лямбды

        info.testStudents(students, (Student s) -> {return s.age>22 && s.avgGrade<8 && s.sex == 'm';});

//        info.testStudents(students, new CheckOverGrade());

//        info.printStudentsOverGrade(students, 8);
//        System.out.println("----------");
//        info.printStudentsUnderAge(students, 20);
//        System.out.println("----------");
//        info.printStudentsMixCondition(students, 25, 7, 'm');
    }
}

//interface StudentChecks{
//    boolean check (Student s);
//}
