package curriculum.d;

import java.util.Random;

public class Player extends Character {

    public Player(String name) {
        super(
                name,
                new Random().nextInt(41) + 60,
                new Random().nextInt(11) + 10,
                new Random().nextInt(10) + 1
        );
    }
}