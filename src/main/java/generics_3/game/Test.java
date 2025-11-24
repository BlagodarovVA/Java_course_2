package generics_3.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Alex", 16);
        Schoolar schoolar2 = new Schoolar("Katya", 15);
        Schoolar schoolar3 = new Schoolar("Petr", 14);
        Schoolar schoolar4 = new Schoolar("Alena", 13);

        Student student1 = new Student("Vadim", 20);
        Student student2 = new Student("Tatiana", 21);
        Student student3 = new Student("Andrey", 22);
        Student student4 = new Student("Elena", 23);

        Employee employee1 = new Employee("Valery", 35);
        Employee employee2 = new Employee("Diana", 28);

        Team<Schoolar> schoolarTeam1 = new Team <>("Драконы");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);
        Team<Schoolar> schoolarTeam2 = new Team <>("Малакасосы");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam1 = new Team <>("Трусы");
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);
        Team<Student> studentTeam2 = new Team <>("Балбесы");
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        Team<Employee> employeeTeam = new Team <>("Starper");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> otherTeam = new Team <>("Other");

        System.out.println("----------");
        schoolarTeam1.playWith(schoolarTeam2);
        studentTeam1.playWith(studentTeam2);

    }
}
