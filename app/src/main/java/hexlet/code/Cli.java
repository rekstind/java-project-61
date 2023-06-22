package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Hello, " + s + "!");

    }
}
