package Shedule;



import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Group gr_1 = new Group("10A", 100, 4);
        Sub match_1 = new Sub("Match", 40);
        Sub history_1 = new Sub("History", 30);
        Sub language_1 = new Sub("Language", 30);
        gr_1.addSubject(match_1);
        gr_1.addSubject(history_1);
        gr_1.addSubject(language_1);
        Group gr_2 = new Group("8 B", 300, 5);
        Group gr_3 = new Group("9A", 200, 4);
        Group gr_4 = new Group("6G", 150, 9);

    }
}
