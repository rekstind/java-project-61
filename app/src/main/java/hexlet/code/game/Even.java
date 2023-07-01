package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even extends Games implements Game {

    public Even(String userName) {
        super(userName);
    }

    @Override
    public void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Engine.runEngine(scanner, this);
    }

    @Override
    public String[] getQnA() {
        String[] result = new String[2];

        int randomInt = random.nextInt(100);
        boolean isEven = randomInt % 2 == 0;
        result[0] = String.valueOf(randomInt);
        result[1] = isEven ? "yes" : "no";

        return result;
    }
}
