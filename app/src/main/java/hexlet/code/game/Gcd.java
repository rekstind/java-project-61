package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Scanner;

public class Gcd extends Games implements Game {

    public Gcd(String userName) {
        super(userName);
    }

    @Override
    public void startGame(Scanner scanner) {
        System.out.println("Find the greatest common divisor of given numbers.");

        Engine.runEngine(scanner, this);
    }

    @Override
    public String[] getQnA() {
        String[] result = new String[2];

        BigInteger a = new BigInteger(7, random);
        BigInteger b = new BigInteger(7, random);

        BigInteger max = a.gcd(b);

        result[0] = a + " " + b;
        result[1] = max.toString();

        return result;
    }
}
