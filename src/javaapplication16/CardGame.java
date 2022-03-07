/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import p2.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create an array to hold 7 cards
        Card hand[] = CardHandGenerator.generateHand(7);
        System.out.println("cards in Hand: ");
        for (Card card : hand) {
            System.out.printf("value: %d, Suit : %s \n" , card.getValue(), card.getSuit());
        }

        System.out.println("Pick a suit:");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();

        System.out.println("Enter a value: 1-13: ");
        int value = input.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

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
