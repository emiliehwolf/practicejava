package lab12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Uses a graphical user interface and event listeners to tally votes for two
 * candidates -- Blue and Red
 * 
 * @author *** YOUR NAME HERE ***
 */
public class VoteCounterPanel extends JPanel
{
   private int votesForBlue;
   private JLabel labelBlue;
   private JButton blue;

   /**
    * Sets up the GUI
    */
   public VoteCounterPanel()
   {
      votesForBlue = 0;

      blue = new JButton("Vote for Blue!");
      VoteButtonListener voteListener = new VoteButtonListener();
      blue.addActionListener(voteListener);

      labelBlue = new JLabel("Votes for Blue: " + votesForBlue);

      add(blue);
      add(labelBlue);
      setBackground(Color.white);
   }

   /**
    * Represents a listener for button push actions
    */
   private class VoteButtonListener implements ActionListener
   {
      /**
       * Updates the counter and label when the button is pushed
       * 
       * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
       */
      public void actionPerformed(ActionEvent event)
      {
         votesForBlue++;
         labelBlue.setText("Votes for Blue: " + votesForBlue);
      }
   }
}
