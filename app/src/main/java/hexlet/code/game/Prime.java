package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    public static void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Engine.runEngine(scanner, Prime.class.getSimpleName());
    }

    public static String[] getQnA() {
        Random random = new Random();

        String[] result = new String[2];

        int limit = 1000;
        int i = random.nextInt(limit);

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
}
