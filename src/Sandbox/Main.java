package Sandbox;

import java.util.Scanner;

public class Main {
    static final String text = "тайланд - красивая страна. Многие люди посещают Тайланд";

    public static void main(String[] args) {

        System.out.println(Regular.test("Ivan"));
        System.out.println(Regular.test("IVAN"));

        System.out.println(Regular.test("vanya"));
        System.out.println(text.replaceAll("[Тт]а[йи]ланд", "Россия"));

        System.out.println(Regular.test2("site.ua"));
        System.out.println(Regular.test2("site.ru"));

    }

}
