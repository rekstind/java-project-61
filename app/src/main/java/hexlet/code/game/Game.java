package hexlet.code.game;

import java.util.Scanner;

public interface Game {

    void startGame(Scanner scanner);

    String[] getQnA();

    String getUserName();
}
