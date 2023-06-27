package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            String s = scanner.next();

            if (s.equals("0")) {
                break;
            }

            if (s.equals("2")) {
                EvenGame.startGame(scanner);
            }

        }


    }
}
