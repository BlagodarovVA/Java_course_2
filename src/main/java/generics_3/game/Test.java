package generics_3.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Alex", 16);
        Schoolar schoolar2 = new Schoolar("Katya", 15);

        Student student1 = new Student("Vadim", 20);
        Student student2 = new Student("Tatiana", 21);

        Employee employee1 = new Employee("Valery", 35);
        Employee employee2 = new Employee("Diana", 28);

        Team<Schoolar> schoolarTeam = new Team <>("Драконы");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team <>("KOK");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team <>("StarPer");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        Team<String> otherTeam = new Team <>("Other");

        Team<Schoolar> schoolarTeam2 = new Team <>("Малакасосы");
        Schoolar schoolar3 = new Schoolar("Petr", 14);
        Schoolar schoolar4 = new Schoolar("Alena", 13);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        System.out.println("----------");
        schoolarTeam.playWith(schoolarTeam2);



    }
}
