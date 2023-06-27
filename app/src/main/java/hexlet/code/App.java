package hexlet.code;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");

            String s = scanner.next();

            System.out.println("Your choice: " + s);

            if (s.equals("0")) {
                break;
            }

            if (s.equals("2")) {
                EvenGame.startGame(scanner);
            }

        }


    }
}
