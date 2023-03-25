package Shedule;



import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Group gr_1 = new Group("10A", 100, 4);
        Sub match = new Sub("Match", 40);
        Sub history = new Sub("History", 30);
        Sub language = new Sub("Language", 30);
        gr_1.addSubject(match);
        gr_1.addSubject(history);
        gr_1.addSubject(language);
        Group gr_2 = new Group("8 B", 300, 5);
        match.setCountHours(50);
        gr_2.addSubject(match);
        history.setCountHours(40);
        gr_2.addSubject(history);
        history.setCountHours(50);
        gr_2.addSubject(language);
        gr_1.getAllCurriculum();
        Group gr_3 = new Group("9A", 200, 4);
    }
}
