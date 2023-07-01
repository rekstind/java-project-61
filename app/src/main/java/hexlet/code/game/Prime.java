package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    private static final int LIMIT = 1000;

    public static void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();

        String[] result = new String[2];

        int i = random.nextInt(LIMIT);

        result[0] = String.valueOf(i);
        result[1] = isPrime(i) ? "yes" : "no";

        return result;
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1) {
            return false;
        }

        // Check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String getGameNumber() {
        return "6";
    }
}
