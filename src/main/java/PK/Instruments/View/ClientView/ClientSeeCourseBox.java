package PK.Instruments.View.ClientView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import PK.Instruments.Model.Lessons.Lesson;


public class ClientSeeCourseBox {
	
	private JFrame frame;
    private JButton backToWelcomeButton;
    
    List<JLabel> labels = new ArrayList<JLabel>();
    

    public ClientSeeCourseBox()
    {
        frame = new JFrame("Twoje kursy");                                                                            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new GridLayout(10,0));
        backToWelcomeButton = new JButton("Wroc");
        frame.add(backToWelcomeButton);

        frame.getContentPane().setBackground(new Color(220, 236, 237));    
        frame.setResizable(false);
        frame.setSize(290,330);        
        frame.setVisible(false);
    }

    public void updateLessons(List<Lesson> lessons)
    {
    	this.resetFrame();
    	
        for(Lesson lesson : lessons)
        {
        	JLabel label = new JLabel(lesson.toString());
        	frame.add(label);
        }
    }
    
    public void setVisibility(boolean visibility)
    {
    	this.frame.setVisible(visibility);
    }
    
    public JButton getBackToWelcomeButton()
    {
        return backToWelcomeButton;
    }
    
    private void resetFrame()
    {
    	frame = new JFrame("Twoje kursy");                                                                            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new GridLayout(10,0));
        frame.add(backToWelcomeButton);

        frame.getContentPane().setBackground(new Color(220, 236, 237));    
        frame.setResizable(false);
        frame.setSize(290,330);        
        frame.setVisible(false);
    }
}