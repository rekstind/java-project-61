package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Gcd {
    private static final int MAX_BITS = 3;
    private static final int QUESTIONS_COUNT = 3;
    private static final int QNA_LENGTH = 2;

    public static void startGame(Scanner scanner) {
        System.out.println("Find the greatest common divisor of given numbers.");

        Engine.runEngine(scanner, getQnA());
    }

    public static String[][] getQnA() {
        Random random = new Random();

        String[][] result = new String[QUESTIONS_COUNT][QNA_LENGTH];

        BigInteger a;
        BigInteger b;

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            a = new BigInteger(MAX_BITS, random);
            b = new BigInteger(MAX_BITS, random);

            result[i][0] = a + " " + b;
            result[i][1] = getGCD(a, b);
        }

        return result;
    }

    public static String getGCD(BigInteger a, BigInteger b) {
        return a.gcd(b).toString();
    }
}
