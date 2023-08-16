package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;

public class Gcd {
    private static final int MAX_BITS = 3;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        Engine.runEngine(generateQuestionsAndAnswers(), DESCRIPTION);
    }

    public static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();

        String[][] result = new String[Engine.QUESTIONS_COUNT][Engine.QNA_LENGTH];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            BigInteger a = new BigInteger(MAX_BITS, random);
            BigInteger b = new BigInteger(MAX_BITS, random);

            result[i][0] = a + " " + b;
            result[i][1] = getGCD(a, b).toString();
        }

        return result;
    }

    public static BigInteger getGCD(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }
}
