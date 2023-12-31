package hexlet.code;

import hexlet.code.game.Even;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printGameMenu();

        System.out.print("Your choice: ");
        String s = scanner.next();

        if (s.equals("0")) {
            return;
        }

        switch (s) {
            case "1" -> Cli.greetings();
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> Gcd.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            default -> System.out.println("Game not selected");
        }

        scanner.close();
    }

    static void printGameMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

    }
}
