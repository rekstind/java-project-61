package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final int MIN_SIZE = 5;
    private static final int MAX_SIZE = 10;
    private static final int MAX_STEP = 20;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void startGame() {
        Engine.runEngine(generateQuestionsAndAnswers(), DESCRIPTION);
    }

    public static String[][] generateQuestionsAndAnswers() {
        Random random = new Random();

        String[][] result = new String[Engine.QUESTIONS_COUNT][Engine.QNA_LENGTH];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            result[i][0] = "";

            int limit = random.nextInt(MAX_SIZE);
            while (limit < MIN_SIZE) {
                limit = random.nextInt(MAX_SIZE);
            }

            int step = random.nextInt(MAX_STEP);

            int[] progressionNumbers = getProgressionNumbers(limit, step);

            int hide = random.nextInt(progressionNumbers.length);

            result[i][0] = getQuestion(progressionNumbers, hide);
            result[i][1] = getAnswer(progressionNumbers, hide);
        }

        return result;
    }

    public static int[] getProgressionNumbers(int limit, int step) {

        int[] result = new int[limit];

        for (int i = 0; i < result.length; i++) {
            result[i] = step + i * step;
        }

        return result;
    }

    public static String getQuestion(int[] numbers, int hidePosition) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            result.append(i == hidePosition ? ".. " : numbers[i] + " ");
        }
        return result.toString();
    }

    public static String getAnswer(int[] numbers, int hidePosition) {
        return String.valueOf(numbers[hidePosition]);
    }
}
