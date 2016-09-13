package PK.Instruments.View.TeacherView;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

 
public class TeacherOffice implements ItemListener
{
    JPanel cards;
    JLabel label, label1;
    JFrame frame;
    private JButton backToWelcomeButton;
    
    public TeacherOffice()
    {
    	//Create and set up the window.
        frame = new JFrame("Sale konsultacji");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Create and set up the content pane.
        addComponentToPane(frame.getContentPane());
       
         
        //Display the window.
        //frame.pack();
        frame.setSize(420,420);
        frame.setResizable(false);
        frame.setVisible(false);
    }

     
    public void addComponentToPane(Container pane) 
    {
      
             
        JPanel card = new JPanel();
        card.setBackground(new Color(220, 236, 237));
                       
        label = new JLabel("<html><br><h3>Sala 1:</h3> Parter - 006 -> Gitara<br>"
        		+ "<br><h3>Sala 2:</h3> Parter - 013 -> Studio dla zespolow<br>"
        		+ "<br><h3>Sala 3:</h3> Pietro I - 107 -> Fortepian solo<br>"
        		+ "<br><h3>Sala 4:</h3> Pietro I - 108 -> Fortepian duet<br>"
        		+ "<br><h3>Sala 4:</h3> Pietro I - 116 -> Sala choralna<br> </html>");
        
        card.add(label);
        backToWelcomeButton = new JButton("Wroc");
        card.add(backToWelcomeButton);

       // Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card);
         
        pane.add(cards, BorderLayout.CENTER);
    }
     
    public void itemStateChanged(ItemEvent evt) 
    {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    public void setVisibility(boolean visibility)
    {
    	this.frame.setVisible(visibility);
    }
    
    public JButton getBackToWelcomeButton()
    {
        return backToWelcomeButton;
    }
}