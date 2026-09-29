/*
 * Rahika Faruque
 * 991827678
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        
        String suit;
        int value;
        boolean cardMatch = false;
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt(13) + 1);
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            magicHand[i]=c;
        }
        
        //print the hand
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.print(magicHand[i].getSuit() + " ");
            System.out.println(magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card check = new Card();
        
        System.out.print("Ender a card value (1-13): ");
        value = s.nextInt();
        check.setValue(value);

        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        suit = n.next();
        check.setSuit(suit);
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)
        {
            if (check.getSuit().equals(magicHand[i].getSuit()) && check.getValue() == magicHand[i].getValue())
            {
                cardMatch = true;
            }
        }
        
        //Then report the result here
        if (cardMatch) {
            System.out.println("Your card ("+ suit + " " + value + ") is in the hand.");
        } else {
            System.out.println("Your card ("+ suit + " " + value + " is not in the hand.");
        }
        
        // add one luckcard hard code 2,clubs
        
        
        s.close();
        n.close();
    }
    
}
