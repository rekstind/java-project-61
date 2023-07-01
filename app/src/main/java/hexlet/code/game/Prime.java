package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime extends Games implements Game {

    public Prime(String userName) {
        super(userName);
    }

    @Override
    public void startGame(Scanner scanner) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Engine.runEngine(scanner, this);
    }

    @Override
    public String[] getQnA() {
        String[] result = new String[2];

        int i = random.nextInt(1000);

        result[0] = String.valueOf(i);
        result[1] = isPrime(i) ? "yes" : "no";

        return result;
    }

    public boolean isPrime(int n) {
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
