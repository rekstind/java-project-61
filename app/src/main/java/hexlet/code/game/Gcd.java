package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Gcd {
    private static final int MAX_BITS = 3;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startGame(Scanner scanner) {
        Engine.runEngine(scanner, generateQuestionsAndAnswers(), DESCRIPTION);
    }

    public static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();

        String[][] result = new String[Engine.QUESTIONS_COUNT][Engine.QNA_LENGTH];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            BigInteger a = new BigInteger(MAX_BITS, random);
            BigInteger b = new BigInteger(MAX_BITS, random);

            result[i][0] = a + " " + b;
            result[i][1] = getGCD(a, b);
        }

        return result;
    }

    public static String getGCD(BigInteger a, BigInteger b) {
        return a.gcd(b).toString();
    }
}
