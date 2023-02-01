package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks
 * the user to pick a card. It then searches the array of cards for the match to
 * the user's card. To be used as starting code in Exercise
 *
 * @author nabilf
 * @author Farhan Afser Nabil Feb 01, 2023
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Random random = new Random();
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(3)]);
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        Card userCard = new Card();
        System.out.println("Enter the card value: (1 to 10, 11 for jack, 12 for queen, 13 for king");
        userCard.setValue(scanner.nextInt());
        System.out.println("Enter the card suit: 1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs");
        userCard.setSuit(Card.SUITS[scanner.nextInt() - 1]);
        for (int i = 0; i < hand.length; i++) {
            Card card = hand[i];
            if (card.getSuit().equals(userCard.getSuit()) && card.getValue() == userCard.getValue()) {
                printInfo();
                break;
            }
        }

    }

    /**
     * A simple method to print out personal information. Follow the
     * instructions to replace this information with your own.
     *
     * @author Farhan Afser Nabil Feb 2023
     */
    
    /* I'm done */
    private static void printInfo() {

        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Farhan");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Become a IT Professional");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Play Games");
        System.out.println("-- Play Guitar");

        System.out.println();

    }

}
