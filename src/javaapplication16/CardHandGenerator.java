package javaapplication16;

import java.util.Random;

public class CardHandGenerator {

    /**
     *
     * @param numHands
     */
    public static Card[] generateHand(int numHands) {

        Card[] hand = new Card[numHands];

        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];
            Card c = new Card(value, suit);
            hand[i] = c;
        }
        return hand;
    }

}
