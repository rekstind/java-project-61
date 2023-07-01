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

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            String s = scanner.next();

            if (s.equals("0")) {
                break;
            }

            Cli.greetings();

            switch (s) {
                case "2":
                    Even.startGame(scanner);
                    break;
                case "3":
                    Calc.startGame(scanner);
                    break;
                case "4":
                    Gcd.startGame(scanner);
                    break;
                case "5":
                    Progression.startGame(scanner);
                    break;
                case "6":
                    Prime.startGame(scanner);
                    break;
                default:
            }

        }

        scanner.close();
    }
}
