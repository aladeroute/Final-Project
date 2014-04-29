import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

/**
   Andrew Laderoute
   CS 110
   Create GUI for war game
*/

public class WarGUI extends JFrame
{
   private ArrayList<ImageIcon> player1Images = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2Images = new ArrayList<ImageIcon>(); 
   
   private JLabel label1, label2;
   
   public WarGUI()
   {
      setTitle("WarGUI");
      setSize(1000,1000);
      Hands h = new Hands();
      player1Images = h.player1Hand();  
      player2Images = h.player2Hand();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      //ImageIcon i1 = new ImageIcon(player1Images.get(0));
      //ImageIcon i2 = new ImageIcon(player2Images.get(0));
      label1 = new JLabel(player1Images.get(0));
      label2 = new JLabel(player2Images.get(0));
      
      add(label1);
      add(label2);
      
      setVisible(true);
    }
}   