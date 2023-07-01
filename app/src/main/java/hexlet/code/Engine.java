package hexlet.code;

import hexlet.code.game.Even;
import hexlet.code.game.Calc;
import hexlet.code.game.Gcd;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;

import java.util.Scanner;

public class Engine {

    public static void runEngine(Scanner scanner, String gameType) {

        String[] questionAndAnswer;
        String answer;

        for (int i = 0; i < 3; i++) {

            questionAndAnswer = getQnA(gameType);

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

    static String[] getQnA(String gameType) {
        String[] result;

        if (gameType.equals(Even.class.getSimpleName())) {
            result = Even.getQnA();
        } else if (gameType.equals(Calc.class.getSimpleName())) {
            result = Calc.getQnA();
        } else if (gameType.equals(Gcd.class.getSimpleName())) {
            result = Gcd.getQnA();
        } else if (gameType.equals(Progression.class.getSimpleName())) {
            result = Progression.getQnA();
        } else if (gameType.equals(Prime.class.getSimpleName())) {
            result = Prime.getQnA();
        } else {
            result = new String[2];
        }

        return result;
    }
}
