package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine.runEngine(scanner, Even.class.getSimpleName());
    }

    public static String[] getQnA() {
        Random random = new Random();
        String[] result = new String[2];

        int randomInt = random.nextInt(1000);
        boolean isEven = randomInt % 2 == 0;
        result[0] = String.valueOf(randomInt);
        result[1] = isEven ? "yes" : "no";

        return result;

    }
}
