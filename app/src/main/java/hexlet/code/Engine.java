package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int QUESTIONS_COUNT = 3;
    public static final int QNA_LENGTH = 2;

    public static void runEngine(Scanner scanner, String[][] questionsAndAnswers, String description) {

        String userName = Cli.greetings();

        System.out.println(description);

        for (String[] questionAndAnswer : questionsAndAnswers) {

            System.out.println("Question: " + questionAndAnswer[0]);
            System.out.print("Your answer: ");

            String answer = scanner.next().trim();

            if (answer.equals(questionAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + questionAndAnswer[1]
                        + "'.");

                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
