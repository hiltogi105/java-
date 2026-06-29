package curriculum.c;

import java.util.Random;

public class CPU {

    private int hand;

    public CPU() {
        Random rand = new Random();
        hand = rand.nextInt(3);
    }

    public int getHand() {
        return hand;
    }

    public String handName() {
        switch(hand) {
        case 0:
            return "グー";
        case 1:
            return "チョキ";
        default:
            return "パー";
        }
    }
}