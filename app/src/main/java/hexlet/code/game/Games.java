package hexlet.code.game;

import java.util.Random;

public class Games {
    String userName;
    Random random;

    public Games(String userName) {
        this.userName = userName;
        random = new Random();
    }

    public String getUserName() {
        return userName;
    }
}
