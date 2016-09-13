package PK.Instruments.View.ClientView;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class ClientAddCourseBox implements ItemListener
{
    private JPanel cards;
    private JLabel label;
    private JButton addCourseButton;
    private JTextField[] CourseData = new JTextField[4];
    private JButton backToWelcomeButton;
    
    JFrame frame;

    public ClientAddCourseBox()
    {
    	
        frame = new JFrame("Dodaj nowy kurs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        addComponentToPane(frame.getContentPane());
       
        frame.setSize(290,330);
        frame.setResizable(false);
        frame.setVisible(false);
    }
    
    public void addComponentToPane(Container pane) 
    {              
        JPanel card = new JPanel();
        card.setBackground(new Color(220, 236, 237));
        backToWelcomeButton = new JButton("Wroc");
        card.add(backToWelcomeButton);

        addCourseButton = new JButton("Dodaj kurs");
                       
        label = new JLabel("Prosze wprowadzic dane o lekcji");
        card.add(label);
        card.add(CourseData[0] = new JTextField("Instrument", 10));
        card.add(CourseData[1] = new JTextField("Poziom", 10));
        card.add(CourseData[2] = new JTextField("Sala", 10));
        card.add(CourseData[3] = new JTextField("Dzien", 10));
     
        card.add(addCourseButton);
        
        cards = new JPanel(new CardLayout());
        cards.add(card);
         
        pane.add(cards, BorderLayout.CENTER);
    }
     
    public void itemStateChanged(ItemEvent evt) 
    {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    public String getCourseData(int x)
    {
    	if(x>=0 && x<4)
    		return CourseData[x].getText();
    	
		return "";
    	
    }

    public void setVisibility(boolean visibility)
    {
    	this.frame.setVisible(visibility);
    }
    
    public JButton getBackToWelcomeButton()
    {
        return backToWelcomeButton;
    }
    
    public JButton getAddCourseButton()
    {
        return addCourseButton;
    }
    
}