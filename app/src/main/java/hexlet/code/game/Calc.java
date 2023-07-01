package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static void startGame(Scanner scanner) {
        System.out.println("What is the result of the expression?");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();

        String[] result = new String[2];

        int limit = 100;
        int countOperation = 3;
        String operation;

        int a = random.nextInt(limit);
        int b = random.nextInt(limit);
        int c = random.nextInt(countOperation);

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
