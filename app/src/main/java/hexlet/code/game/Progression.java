package hexlet.code.game;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression implements Game {
    String userName;
    Random random;

    public Progression(String userName) {
        this.userName = userName;
        random = new Random();
    }

    @Override
    public void startGame(Scanner scanner) {
        System.out.println("What is the result of the expression?");

        Engine.runEngine(scanner, this);
    }

    @Override
    public String[] getQnA() {
        String[] result = new String[2];
        result[0] = "";

        int limit = random.nextInt(10);
        while (limit < 5) {
            limit = random.nextInt(10);
        }

        int multiple = random.nextInt(10);
        int hide = random.nextInt(limit - 1);
        int element = 0;

        for (int i = 0; i < limit; i++) {
            element += multiple;

            result[0] += i == hide ? ".. " : element + " ";
            if (i == hide) {
                result[1] = String.valueOf(element);
            }
        }

        return result;
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
