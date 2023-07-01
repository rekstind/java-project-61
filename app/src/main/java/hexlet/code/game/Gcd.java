package hexlet.code.game;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Gcd {

    public static void startGame(Scanner scanner) {
        System.out.println("Find the greatest common divisor of given numbers.");

        Engine.runEngine(scanner, getGameNumber());
    }

    public static String[] getQnA() {
        Random random = new Random();
        String[] result = new String[2];

        int maxBits = 7;
        BigInteger a = new BigInteger(maxBits, random);
        BigInteger b = new BigInteger(maxBits, random);

        BigInteger max = a.gcd(b);

        result[0] = a + " " + b;
        result[1] = max.toString();

        return result;
    }

    public static String getGameNumber() {
        return "4";
    }
}
