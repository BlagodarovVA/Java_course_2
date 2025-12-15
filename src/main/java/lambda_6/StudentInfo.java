package lambda_6;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, StudentChecks sc){
        for(Student s:al){
            if(sc.check(s)){
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
        info.testStudents(students, (Student s) -> {return s.age < 20;});   // самый короткий вариант - лямбда
        System.out.println("----------");
        info.testStudents(students, (Student s) -> {return s.avgGrade >= 8;});
        System.out.println("----------");
        info.testStudents(students, (Student s) -> {return s.age>22 && s.avgGrade<8 && s.sex == 'm';});

//        info.testStudents(students, new CheckOverGrade());

//        info.printStudentsOverGrade(students, 8);
//        System.out.println("----------");
//        info.printStudentsUnderAge(students, 20);
//        System.out.println("----------");
//        info.printStudentsMixCondition(students, 25, 7, 'm');
    }
}

interface StudentChecks{
    boolean check (Student s);
}
