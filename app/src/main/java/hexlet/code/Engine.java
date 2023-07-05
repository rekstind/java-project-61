package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void runEngine(Scanner scanner, String[][] gameCredentials) {

        String[] questionAndAnswer;
        String answer;

        for (String[] gameCredential : gameCredentials) {
            questionAndAnswer = gameCredential;

            System.out.println("Question: " + questionAndAnswer[0]);
            System.out.print("Your answer: ");

            answer = scanner.next().trim();

            if (answer.equals(questionAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionAndAnswer[1]
                        + "'.");

                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}
