package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Game;
import hexlet.code.game.Gcd;

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
            System.out.println("4 - GCD");
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
                case "2" -> game = new Even(userName);
                case "3" -> game = new Calc(userName);
                case "4" -> game = new Gcd(userName);
            }

            if (game != null) {
                game.startGame(scanner);
            }
        }
    }
}
