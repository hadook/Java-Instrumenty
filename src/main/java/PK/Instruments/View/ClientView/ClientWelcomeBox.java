package PK.Instruments.View.ClientView;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class ClientWelcomeBox
{
	JPanel card;
    JLabel label, label2, label1;
    JButton see;
    JButton add;
    JFrame frame;
     
    public ClientWelcomeBox()
    {
    	
        frame = new JFrame("Witaj!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addComponentToPane(frame.getContentPane());
       
        frame.setSize(290,330);
        frame.setResizable(false);
        frame.setVisible(false);
    }
    
    public void addComponentToPane(Container pane) 
    {    
        card = new JPanel();
        card.setBackground(new Color(220, 236, 237));

        see = new JButton("Moje lekcje");
        add = new JButton("Dodaj kurs");
                  
        label = new JLabel("Witamy"
        		+ " na stronie glownej.          ");
        
        card.add(label);
        card.add(see);
        card.add(add);
       
        pane.add(card, BorderLayout.CENTER);
    }
     
    public void itemStateChanged(ItemEvent evt) 
    {
        CardLayout cl = (CardLayout)(card.getLayout());
        cl.show(card, (String)evt.getItem());
    }
    
    public JButton seeCourse()
    {
    	return see;
    }
     
    public JButton addCourse()
    {
    	return add;
    }
    
    public void setVisibility(boolean visibility)
    {
    	this.frame.setVisible(visibility);
    }

}
