package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final int LIMIT = 1000;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        Engine.runEngine(generateQuestionsAndAnswers(), DESCRIPTION);
    }

    public static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();

        String[][] result = new String[Engine.QUESTIONS_COUNT][Engine.QNA_LENGTH];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int nextInt = random.nextInt(LIMIT);

            result[i][0] = String.valueOf(nextInt);
            result[i][1] = isPrime(nextInt) ? "yes" : "no";
        }

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
