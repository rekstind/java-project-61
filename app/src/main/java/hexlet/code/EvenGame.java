package hexlet.code;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void startGame(Scanner scanner) throws IOException {
        String userName = Cli.greetings();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        String answer;
        int randomInt;
        boolean isEven;

        for (int i = 0; i < 3; i++) {
            randomInt = random.nextInt(100);
            isEven = randomInt % 2 == 0;

            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");

            answer = scanner.next().trim();

            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + (isEven ? "yes" : "no") + "'.");

                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");

    }
}
