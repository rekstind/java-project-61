package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String userName;

    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Cli.userName = userName;
    }
}
