package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private static final int LIMIT = 100;
    private static final String[] ACTIONS = {"+", "-", "*"};
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void startGame(Scanner scanner) {
        Engine.runEngine(scanner, generateQuestionsAndAnswers(), DESCRIPTION);
    }

    public static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();

        String[][] result = new String[Engine.QUESTIONS_COUNT][Engine.QNA_LENGTH];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int a = random.nextInt(LIMIT);
            int b = random.nextInt(LIMIT);
            String action = ACTIONS[random.nextInt(ACTIONS.length)];

            result[i][0] = String.format("%s %s %s", a, action, b);
            result[i][1] = String.valueOf(calculate(a, b, action));
        }

        return result;
    }

    private static int calculate(int a, int b, String action) {
        return switch (action) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };

    }
}
