import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

/**
   Andrew Laderoute
   CS 110
   Create GUI for war game
*/

public class WarGUI extends JFrame
{
   private ArrayList<ImageIcon> player1Images = new ArrayList<ImageIcon>();
   private ArrayList<ImageIcon> player2Images = new ArrayList<ImageIcon>(); 
   private JButton j;
   private JLabel label1, label2, label3, label4, label5, label6, label7, label8;
   private ImageIcon image1, image2,tie1,tie2,tie3,tie4;
   private String s1,s2;
   
   
   public WarGUI()
   {
      setTitle("WarGUI");
      setSize(450,1000);
      Hands h = new Hands();
      player1Images = h.player1Hand();  
      player2Images = h.player2Hand();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      j = new JButton("Flip");
      j.addActionListener(new JListener());
      
      
      setLayout(new FlowLayout());
      ImageIcon i = new ImageIcon("back.jpg");
      label1 = new JLabel(i);
      
      label2 = new JLabel(i);
      
      label3 = new JLabel("Player1: " + player1Images.size());
      
      label4 = new JLabel("Player2: " + player2Images.size());
      
      label5 = new JLabel();
      
      label6 = new JLabel();
      
      label7 = new JLabel();
      
      label8 = new JLabel();
      
      
      
      
      
      add(label3);
      add(label1);
      add(label2);
      add(j);
      add(label5);
      add(label7);
      add(label4);
      add(label6);
      add(label8);
      
      
     
      setVisible(true);
      
    }
    private class JListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            label5.setIcon(null);
            label6.setIcon(null);
            label7.setIcon(null);
            label8.setIcon(null);
            image1 = player1Images.get(0);
            image2 = player2Images.get(0);
            label1.setIcon(player1Images.remove(0));
            label2.setIcon(player2Images.remove(0));
            label3.setText("Player1: " + player1Images.size());
            label4.setText("Player2: " + player2Images.size());
            
            
            s1 = image1.getDescription();
            s2 = image2.getDescription();
            int value1 = 0;
            int value2 = 0;
            
            for(int i = 0; i<1;i++)
            {
               if(s1.startsWith("2"))
                  value1 = 2;
               else if(s1.startsWith("3"))
                  value1 = 3;
               else if(s1.startsWith("4"))
                  value1 = 4;
               else if(s1.startsWith("5"))
                  value1 = 5;
               else if(s1.startsWith("6"))
                  value1 = 6;
               else if(s1.startsWith("7"))
                  value1 = 7;
               else if(s1.startsWith("8"))
                  value1 = 8;
               else if(s1.startsWith("9"))
                  value1 = 9;
               else if(s1.startsWith("10"))
                  value1 = 10;
               else if(s1.startsWith("j"))
                  value1 = 11;
               else if(s1.startsWith("q"))
                  value1 = 12;
               else if(s1.startsWith("k"))
                  value1 = 13;
               else if(s1.startsWith("a"))
                  value1 = 14;
            }
            
            for(int i = 0; i<1;i++)
            {
               if(s2.startsWith("2"))
                  value2 = 2;
               else if(s2.startsWith("3"))
                  value2 = 3;
               else if(s2.startsWith("4"))
                  value2 = 4;
               else if(s2.startsWith("5"))
                  value2 = 5;
               else if(s2.startsWith("6"))
                  value2 = 6;
               else if(s2.startsWith("7"))
                  value2 = 7;
               else if(s2.startsWith("8"))
                  value2 = 8;
               else if(s2.startsWith("9"))
                  value2 = 9;
               else if(s2.startsWith("10"))
                  value2 = 10;
               else if(s2.startsWith("j"))
                  value2 = 11;
               else if(s2.startsWith("q"))
                  value2 = 12;
               else if(s2.startsWith("k"))
                  value2 = 13;
               else if(s2.startsWith("a"))
                  value2 = 14;
            }
            
            if(value1>value2)
            {
               player1Images.add(image1);
               player1Images.add(image2);
               label3.setText("Player1: " + player1Images.size());
               label4.setText("Player2: " + player2Images.size());
            
            }
            else if(value2>value1)
            {
               player2Images.add(image1);
               player2Images.add(image2);
               label3.setText("Player1: " + player1Images.size());
               label4.setText("Player2: " + player2Images.size());
            
            }
            else if(value2 == value1)
            {
               tie1 = player1Images.remove(0);
               if(player1Images.size()==0)
               {
                  JOptionPane.showMessageDialog(null, "Player 2 wins!");
               }
               tie2 = player2Images.remove(0);
               if(player2Images.size()==0)
               {
                  JOptionPane.showMessageDialog(null, "Player 1 wins!");
               }
               tie3 = player1Images.remove(0);
               if(player1Images.size()==0)
               {
                  JOptionPane.showMessageDialog(null, "Player 2 wins!");
               }
               tie4 = player2Images.remove(0); 
               if(player2Images.size()==0)
               {
                  JOptionPane.showMessageDialog(null, "Player 1 wins!");
               }
               ImageIcon back = new ImageIcon("back.jpg");
               label5.setIcon(back);
               label7.setIcon(back);
               label6.setIcon(tie3);
               label8.setIcon(tie4);
               
               player1Images.add(image2);
               player2Images.add(image1);
               player1Images.add(tie2);
               player2Images.add(tie1);
               player1Images.add(tie4);
               player2Images.add(tie3);
               
               
               
            
            }
            if (player1Images.size()==0)
            {
               JOptionPane.showMessageDialog(null,"Player 2 wins!");
            }
            else if(player2Images.size()==0)
            {
               JOptionPane.showMessageDialog(null,"Player 1 wins!");
            }
         }
         catch (RuntimeException r)
         {
            JOptionPane.showMessageDialog(null, "Runtime error");
         }
         
      }
    }     
}   