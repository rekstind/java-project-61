package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc extends Games implements Game {

    public Calc(String userName) {
        super(userName);
    }

    @Override
    public void startGame(Scanner scanner) {
        System.out.println("What is the result of the expression?");

        Engine.runEngine(scanner, this);
    }

    @Override
    public String[] getQnA() {
        String[] result = new String[2];

        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100) % 3;

        if (c == 0) {
            result[0] = a + " + " + b;
            result[1] = String.valueOf(a + b);
        } else if (c == 1) {
            result[0] = a + " - " + b;
            result[1] = String.valueOf(a - b);
        } else {
            result[0] = a + " * " + b;
            result[1] = String.valueOf(a * b);
        }

        return result;
    }
}
