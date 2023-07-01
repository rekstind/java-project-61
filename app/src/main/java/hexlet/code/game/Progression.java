package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    private static final int MIN_SIZE = 5;
    private static final int MAX_SIZE = 10;
    private static final int MAX_STEP = 20;


    public static void startGame(Scanner scanner) {
        System.out.println("What number is missing in the progression?");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();

        String[] result = new String[2];
        result[0] = "";

        int limit = random.nextInt(MAX_SIZE);
        while (limit < MIN_SIZE) {
            limit = random.nextInt(MAX_SIZE);
        }

        int multiple = random.nextInt(MAX_STEP);
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
