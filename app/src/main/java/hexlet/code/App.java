package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = null;
        String userName = null;

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            String s = scanner.next();

            if (s.equals("0")) {
                break;
            }

            if (s.equals("1") || userName == null) {
                userName = Cli.greetings();
            }

            if (s.equals("2")) {
                game = new Even(userName);
            } else if (s.equals("3")) {
                game = new Calc(userName);
            }

            if (game != null) {
                game.startGame(scanner);
            }
        }
    }
}
