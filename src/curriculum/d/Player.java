package curriculum.d;

import java.util.Random;

public class Player extends Character {
	
	private static final Random rand = new Random();

    public Player(String name) {
        super(
                name,
                rand.nextInt(41) + 60,
                rand.nextInt(11) + 10,
                rand.nextInt(10) + 1
        );
    }
}