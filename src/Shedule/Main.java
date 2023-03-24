package Shedule;



import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Group gr_1 = new Group("10А", 100);
        Sub match = new Sub("Match", 40);
        Sub history = new Sub("History", 30);
        Sub language = new Sub("Language", 30);
        gr_1.addSubject(match);
        gr_1.addSubject(history);
        gr_1.addSubject(language);
        Group gr_2 = new Group("8Б", 140);
        match.setCountHours(50);
        gr_2.addSubject(match);
        history.setCountHours(40);
        gr_2.addSubject(history);
        history.setCountHours(50);
        gr_2.addSubject(language);
        gr_1.getAllCurriculum();

    }
}
