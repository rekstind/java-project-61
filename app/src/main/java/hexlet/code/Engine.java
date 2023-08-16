package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int QUESTIONS_COUNT = 3;
    public static final int QNA_LENGTH = 2;

    public static void runEngine(String[][] questionsAndAnswers, String description) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

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

                scanner.close();

                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");

        scanner.close();
    }
}
