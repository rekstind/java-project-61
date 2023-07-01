package hexlet.code;

import hexlet.code.game.Even;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;

import java.util.Scanner;

public class Engine {

    private static final int QUESTION_COUNT = 3;

    public static void runEngine(Scanner scanner, String gameNumber) {

        String[] questionAndAnswer;
        String answer;

        for (int i = 0; i < QUESTION_COUNT; i++) {

            questionAndAnswer = getQnA(gameNumber);

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

    static String[] getQnA(String gameNumber) {
        String[] result;

        if (gameNumber.equals(Even.getGameNumber())) {
            result = Even.getQnA();
        } else if (gameNumber.equals(Calc.getGameNumber())) {
            result = Calc.getQnA();
        } else if (gameNumber.equals(Gcd.getGameNumber())) {
            result = Gcd.getQnA();
        } else if (gameNumber.equals(Progression.getGameNumber())) {
            result = Progression.getQnA();
        } else if (gameNumber.equals(Prime.getGameNumber())) {
            result = Prime.getQnA();
        } else {
            result = new String[2];
        }

        return result;
    }
}
