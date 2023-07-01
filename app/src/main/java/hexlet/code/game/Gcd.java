package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Gcd implements Game {
    String userName;
    Random random;

    public Gcd(String userName) {
        this.userName = userName;
        random = new Random();
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

    @Override
    public String getUserName() {
        return userName;
    }
}
