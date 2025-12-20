package r3_generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {         // Если указать джеенерик, то можно при создании команды конкретизировать тип
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        participants.add(participant);

        // кастим до Participant, т.к. getName есть только у Participant
//        System.out.println("В команду " + name + " был добавлен новый участник: " + ((Participant)participant).getName());
        // кастинг не нужен, если в классе указать <T extends Participant>
        System.out.println("В команду '" + name + "' добавлен новый участник: " + participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        String loserName;
        Random random = new Random();
        int i = random.nextInt(2);
        if( i == 0){
            winnerName = this.name;
            loserName = team.name;
        } else {
            winnerName = team.name;
            loserName = this.name;
        }
        System.out.println("Команда '" + winnerName + "' выиграла у '" + loserName + "'");
    }
}
