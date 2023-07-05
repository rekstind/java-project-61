package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {

    private static final int LIMIT = 1000;
    private static final int QUESTIONS_COUNT = 3;
    private static final int QNA_LENGTH = 2;

    public static void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine.runEngine(scanner, getQnA());
    }

    public static String[][] getQnA() {
        Random random = new Random();
        String[][] result = new String[QUESTIONS_COUNT][QNA_LENGTH];

        int randomInt;

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            randomInt = random.nextInt(LIMIT);
            result[i][0] = String.valueOf(randomInt);
            result[i][1] = isEven(randomInt) ? "yes" : "no";
        }

        return result;
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
