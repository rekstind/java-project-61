package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void startGame(Scanner scanner) {
        System.out.println("What is the result of the expression?");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();

        String[] result = new String[2];
        result[0] = "";

        int minSize = 5;
        int maxSize = 10;
        int maxStep = 20;

        int limit = random.nextInt(maxSize);
        while (limit < minSize) {
            limit = random.nextInt(maxSize);
        }

        int multiple = random.nextInt(maxStep);
        int hide = random.nextInt(limit);
        int element = 0;

        for (int i = 0; i < limit; i++) {
            element += multiple;

            result[0] += i == hide ? ".. " : element + " ";
            if (i == hide) {
                result[1] = String.valueOf(element);
            }
        }

        return result;
    }

    public static String getGameNumber() {
        return "5";
    }
}
