package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static final int LIMIT = 1000;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        Engine.runEngine(generateQuestionsAndAnswers(), DESCRIPTION);
    }

    public static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();
        String[][] result = new String[Engine.QUESTIONS_COUNT][Engine.QNA_LENGTH];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int randomInt = random.nextInt(LIMIT);
            result[i][0] = String.valueOf(randomInt);
            result[i][1] = isEven(randomInt) ? "yes" : "no";
        }

        return result;
    }

    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
