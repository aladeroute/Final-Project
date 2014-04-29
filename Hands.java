import java.util.ArrayList;
import javax.swing.*;

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
   private ArrayList<ImageIcon> player1Images = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2Images = new ArrayList<ImageIcon>();
   private Card card;
   private ImageIcon i;
   
   public Hands()
   {
      Deck1 deck = new Deck1();
      deck.shuffle();
      for (int c = 0; c<26; c++)
      {
         player1.add(deck.dealCard());
         player2.add(deck.dealCard());
         
      }
      card = player1.remove(0);
      
      while (player1.size() != 0)
      {
         if (card.getRank()==2 && card.getSuit()==0)
         {
            i = new ImageIcon("2s.jpg");
            player1Images.add(i);
         }
         else if (card.getRank()==2 && card.getSuit()==1)
         {
            i = new ImageIcon("2h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==2 && card.getSuit()==2)
         {
            i = new ImageIcon("2d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==2 && card.getSuit()==3)
         {
            i = new ImageIcon("2c.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==0)
         {
            i = new ImageIcon("3s.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==1)
         {
            i = new ImageIcon("3h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==2)
         {
            i = new ImageIcon("3d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==3)
         {
            i = new ImageIcon("3c.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==0)
         {
            i = new ImageIcon("4s.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==1)
         {
            i = new ImageIcon("4h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==2)
         {
            i = new ImageIcon("4d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==3)
         {
            i = new ImageIcon("4c.jpg");
            player1Images.add(i);
         }
         else if (card.getRank()==5 && card.getSuit()==0)
         {
            i = new ImageIcon("5s.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==5 && card.getSuit()==1)
         {
            i = new ImageIcon("5h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==5 && card.getSuit()==2)
         {
            i = new ImageIcon("5d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==5 && card.getSuit()==3)
         {
            i = new ImageIcon("5c.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==6 && card.getSuit()==0)
         {
            i = new ImageIcon("6s.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==6 && card.getSuit()==1)
         {
            i = new ImageIcon("6h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==6 && card.getSuit()==2)
         {
            i = new ImageIcon("6d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==6 && card.getSuit()==3)
         {
            i = new ImageIcon("6c.jpg");
            player1Images.add(i);
         }
         else if (card.getRank()==7 && card.getSuit()==0)
         {
            i = new ImageIcon("7s.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==7 && card.getSuit()==1)
         {
            i = new ImageIcon("7h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==7 && card.getSuit()==2)
         {
            i = new ImageIcon("7d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==7 && card.getSuit()==3)
         {
            i = new ImageIcon("7c.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==8 && card.getSuit()==0)
         {
            i = new ImageIcon("8s.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==8 && card.getSuit()==1)
         {
            i = new ImageIcon("8h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==8 && card.getSuit()==2)
         {
            i = new ImageIcon("8d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==8 && card.getSuit()==3)
         {
            i = new ImageIcon("8c.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==9 && card.getSuit()==0)
         {
            i = new ImageIcon("9s.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==9 && card.getSuit()==1)
         {
            i = new ImageIcon("9h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==9 && card.getSuit()==2)
         {
            i = new ImageIcon("9d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==9 && card.getSuit()==3)
         {
            i = new ImageIcon("9c.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==10 && card.getSuit()==0)
         {
            i = new ImageIcon("10s.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==10 && card.getSuit()==1)
         {
            i = new ImageIcon("10h.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==10 && card.getSuit()==2)
         {
            i = new ImageIcon("10d.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==10 && card.getSuit()==3)
         {
            i = new ImageIcon("10c.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==11 && card.getSuit()==0)
         {
            i = new ImageIcon("jacks.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==11 && card.getSuit()==1)
         {
            i = new ImageIcon("jackh.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==11 && card.getSuit()==2)
         {
            i = new ImageIcon("jackd.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==11 && card.getSuit()==3)
         {
            i = new ImageIcon("jackc.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==12 && card.getSuit()==0)
         {
            i = new ImageIcon("queens.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==12 && card.getSuit()==1)
         {
            i = new ImageIcon("queenh.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==12 && card.getSuit()==2)
         {
            i = new ImageIcon("queend.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==12 && card.getSuit()==3)
         {
            i = new ImageIcon("queenc.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==13 && card.getSuit()==0)
         {
            i = new ImageIcon("kings.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==13 && card.getSuit()==1)
         {
            i = new ImageIcon("kingh.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==13 && card.getSuit()==2)
         {
            i = new ImageIcon("kingd.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==13 && card.getSuit()==3)
         {
            i = new ImageIcon("kingc.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==14 && card.getSuit()==0)
         {
            i = new ImageIcon("aces.jpg");
            player1Images.add(i);
         }  
         else if (card.getRank()==14 && card.getSuit()==1)
         {
            i = new ImageIcon("aceh.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==14 && card.getSuit()==2)
         {
            i = new ImageIcon("aced.jpg");
            player1Images.add(i);
         } 
         else if (card.getRank()==14 && card.getSuit()==3)
         {
            i = new ImageIcon("acec.jpg");
            player1Images.add(i);
         } 
         player1.remove(0);
      } 
      
      card = player2.remove(0);
      
      while (player2.size() != 0)
      {
         if (card.getRank()==2 && card.getSuit()==0)
         {
            i = new ImageIcon("2s.jpg");
            player2Images.add(i);
         }
         else if (card.getRank()==2 && card.getSuit()==1)
         {
            i = new ImageIcon("2h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==2 && card.getSuit()==2)
         {
            i = new ImageIcon("2d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==2 && card.getSuit()==3)
         {
            i = new ImageIcon("2c.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==0)
         {
            i = new ImageIcon("3s.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==1)
         {
            i = new ImageIcon("3h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==2)
         {
            i = new ImageIcon("3d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==3 && card.getSuit()==3)
         {
            i = new ImageIcon("3c.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==0)
         {
            i = new ImageIcon("4s.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==1)
         {
            i = new ImageIcon("4h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==2)
         {
            i = new ImageIcon("4d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==4 && card.getSuit()==3)
         {
            i = new ImageIcon("4c.jpg");
            player2Images.add(i);
         }
         else if (card.getRank()==5 && card.getSuit()==0)
         {
            i = new ImageIcon("5s.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==5 && card.getSuit()==1)
         {
            i = new ImageIcon("5h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==5 && card.getSuit()==2)
         {
            i = new ImageIcon("5d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==5 && card.getSuit()==3)
         {
            i = new ImageIcon("5c.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==6 && card.getSuit()==0)
         {
            i = new ImageIcon("6s.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==6 && card.getSuit()==1)
         {
            i = new ImageIcon("6h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==6 && card.getSuit()==2)
         {
            i = new ImageIcon("6d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==6 && card.getSuit()==3)
         {
            i = new ImageIcon("6c.jpg");
            player2Images.add(i);
         }
         else if (card.getRank()==7 && card.getSuit()==0)
         {
            i = new ImageIcon("7s.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==7 && card.getSuit()==1)
         {
            i = new ImageIcon("7h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==7 && card.getSuit()==2)
         {
            i = new ImageIcon("7d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==7 && card.getSuit()==3)
         {
            i = new ImageIcon("7c.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==8 && card.getSuit()==0)
         {
            i = new ImageIcon("8s.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==8 && card.getSuit()==1)
         {
            i = new ImageIcon("8h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==8 && card.getSuit()==2)
         {
            i = new ImageIcon("8d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==8 && card.getSuit()==3)
         {
            i = new ImageIcon("8c.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==9 && card.getSuit()==0)
         {
            i = new ImageIcon("9s.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==9 && card.getSuit()==1)
         {
            i = new ImageIcon("9h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==9 && card.getSuit()==2)
         {
            i = new ImageIcon("9d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==9 && card.getSuit()==3)
         {
            i = new ImageIcon("9c.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==10 && card.getSuit()==0)
         {
            i = new ImageIcon("10s.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==10 && card.getSuit()==1)
         {
            i = new ImageIcon("10h.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==10 && card.getSuit()==2)
         {
            i = new ImageIcon("10d.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==10 && card.getSuit()==3)
         {
            i = new ImageIcon("10c.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==11 && card.getSuit()==0)
         {
            i = new ImageIcon("jacks.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==11 && card.getSuit()==1)
         {
            i = new ImageIcon("jackh.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==11 && card.getSuit()==2)
         {
            i = new ImageIcon("jackd.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==11 && card.getSuit()==3)
         {
            i = new ImageIcon("jackc.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==12 && card.getSuit()==0)
         {
            i = new ImageIcon("queens.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==12 && card.getSuit()==1)
         {
            i = new ImageIcon("queenh.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==12 && card.getSuit()==2)
         {
            i = new ImageIcon("queend.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==12 && card.getSuit()==3)
         {
            i = new ImageIcon("queenc.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==13 && card.getSuit()==0)
         {
            i = new ImageIcon("kings.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==13 && card.getSuit()==1)
         {
            i = new ImageIcon("kingh.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==13 && card.getSuit()==2)
         {
            i = new ImageIcon("kingd.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==13 && card.getSuit()==3)
         {
            i = new ImageIcon("kingc.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==14 && card.getSuit()==0)
         {
            i = new ImageIcon("aces.jpg");
            player2Images.add(i);
         }  
         else if (card.getRank()==14 && card.getSuit()==1)
         {
            i = new ImageIcon("aceh.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==14 && card.getSuit()==2)
         {
            i = new ImageIcon("aced.jpg");
            player2Images.add(i);
         } 
         else if (card.getRank()==14 && card.getSuit()==3)
         {
            i = new ImageIcon("acec.jpg");
            player2Images.add(i);
         } 
         player2.remove(0);
         }
               
   
   }
   
   public ArrayList<ImageIcon> player1Hand()
   {
      return player1Images;
   }
   
   public ArrayList<ImageIcon> player2Hand()
   {
      return player2Images;
   }
}
   
   