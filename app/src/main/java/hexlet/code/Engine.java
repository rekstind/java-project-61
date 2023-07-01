package hexlet.code;

import hexlet.code.game.Game;

import java.util.Scanner;

public class Engine {

    public static void runEngine(Scanner scanner, Game game) {

        String[] qestionAndAnswer;
        String answer;

        for (int i = 0; i < 3; i++) {

            qestionAndAnswer = game.getQnA();

            System.out.println("Question: " + qestionAndAnswer[0]);
            System.out.print("Your answer: ");

            answer = scanner.next().trim();

            if (answer.equals(qestionAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + qestionAndAnswer[1]
                        + "'.");

                System.out.println("Let's try again, " + game.getUserName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + game.getUserName() + "!");
    }
}
