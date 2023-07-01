package hexlet.code;

import hexlet.code.game.Even;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;
import hexlet.code.game.Game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game;
        String userName = null;

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

            if (s.equals("1") || userName == null) {
                userName = Cli.greetings();
            }

            switch (s) {
                case "2":
                    game = new Even(userName);
                    break;
                case "3":
                    game = new Calc(userName);
                    break;
                case "4":
                    game = new Gcd(userName);
                    break;
                case "5":
                    game = new Progression(userName);
                    break;
                case "6":
                    game = new Prime(userName);
                    break;
                default:
                    game = null;
            }

            if (game != null) {
                game.startGame(scanner);
            }
        }

        scanner.close();
    }
}
