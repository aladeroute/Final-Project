import java.util.ArrayList;

/**
   Andrew Laderoute
   CS 110
   This class deals the players hands. 
*/

public class Hands
{
   //initialize lists for players to hold cards
   private ArrayList<Card> player1 = new ArrayList<Card>();
   private ArrayList<Card> player2 = new ArrayList<Card>();
   
   public Hands()
   {
      Deck1 deck = new Deck1();
      deck.shuffle();
      for (int c = 0; c<26; c++)
      {
         player1.add(deck.dealCard());
         player2.add(deck.dealCard());
         
      }
   }
   
}
   
   