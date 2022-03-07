package p2;

import java.util.Random;
import java.util.Scanner;

public class CardGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create an array to hold 7 cards
        Card[] hand = new Card[7];

        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card.Value value = Card.Value.values()[random.nextInt(13)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];
            Card c = new Card(value, suit);
            hand[i] = c;
        }
        System.out.println("cards in Hand: ");
        for (Card card : hand) {
            System.out.printf("value: %s, Suit : %s \n", card.getValue(), card.getSuit());
        }

        System.out.println("Pick a suit:");
        for (int i = 0; i < Card.Suit.values().length; i++) {
            System.out.println((i + 1) + ": " + Card.Suit.values()[i]);
        }
        int suitPosition = input.nextInt() -1;

        System.out.println("Enter a value:: ");

        for (int i = 0; i < Card.Value.values().length; i++) {
            System.out.println((i + 1) + ": " + Card.Value.values()[i]);
        }
        int valuePosition = input.nextInt() -1;

        Card userGuess = new Card(Card.Value.values()[valuePosition], 
        Card.Suit.values()[suitPosition]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }

        }
        if (match) {
            System.out.println("Your guess is right");
        } else {
            System.out.println("sorry no match");
        }
    }
}
