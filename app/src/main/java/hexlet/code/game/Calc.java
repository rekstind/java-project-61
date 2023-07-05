package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private static final int LIMIT = 100;
    private static final int QUESTIONS_COUNT = 3;
    private static final int QNA_LENGTH = 2;
    private static final String[] ACTIONS = {"+", "-", "*"};

    public static void startGame(Scanner scanner) {
        System.out.println("What is the result of the expression?");

        Engine.runEngine(scanner, getQnA());
    }

    public static String[][] getQnA() {
        Random random = new Random();

        String[][] result = new String[QUESTIONS_COUNT][QNA_LENGTH];

        int a;
        int b;
        String action;

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            a = random.nextInt(LIMIT);
            b = random.nextInt(LIMIT);
            action = ACTIONS[random.nextInt(ACTIONS.length)];

            result[i][0] = a + action + b;
            result[i][1] = getAnswer(a, b, action);
        }

        return result;
    }

    private static String getAnswer(int a, int b, String action) {
        int result = switch (action) {
            case "+" -> a + b;
            case "-" -> a - b;
            default -> a * b;
        };

        return String.valueOf(result);
    }
}
