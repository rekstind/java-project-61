package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {

    private static final int LIMIT = 1000;

    public static void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();
        String[] result = new String[2];

        int randomInt = random.nextInt(LIMIT);
        boolean isEven = randomInt % 2 == 0;
        result[0] = String.valueOf(randomInt);
        result[1] = isEven ? "yes" : "no";

        return result;

    }

    public static String getGameNumber() {
        return "2";
    }
}
