package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    private static final int LIMIT = 3;
    private static final int COUNT_OPERATION = 3;

    public static void startGame(Scanner scanner) {
        System.out.println("What is the result of the expression?");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();

        String[] result = new String[2];

        String operation;

        int a = random.nextInt(LIMIT);
        int b = random.nextInt(LIMIT);
        int c = random.nextInt(COUNT_OPERATION);

        if (c == 0) {
            operation = " + ";
            result[1] = String.valueOf(a + b);
        } else if (c == 1) {
            operation = " - ";
            result[1] = String.valueOf(a - b);
        } else {
            operation = " * ";
            result[1] = String.valueOf(a * b);
        }

        result[0] = a + operation + b;

        return result;
    }

    public static String getGameNumber() {
        return "3";
    }
}
