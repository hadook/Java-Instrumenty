package PK.Instruments.View.TeacherView;

import java.awt.*;

import javax.swing.*;

import PK.Instruments.Model.Lessons.Lesson;

import java.util.ArrayList;
import java.util.List;


public class TeacherCourses {
	
	private JFrame frame;
    private JButton backToWelcomeButton;

    public TeacherCourses(List<Lesson> lessons)
    {
        frame = new JFrame("Moje kursy instrumentow");                                                                            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new GridLayout(10,0));
        backToWelcomeButton = new JButton("Wroc");
        frame.add(backToWelcomeButton);
        
        List<JLabel> labels = new ArrayList<JLabel>();
        for(Lesson lesson : lessons)
        {
        	labels.add(new JLabel(lesson.toString()));
        }
        
        for(JLabel label : labels)
        {
        	frame.add(label);
        }
        
        frame.getContentPane().setBackground(new Color(220, 236, 237));    
        frame.setResizable(false);
        frame.setSize(290,330);        
        frame.setVisible(false);
    }
    
    public JButton getBackToWelcomeButton()
    {
        return backToWelcomeButton;
    }
    
    public void setVisibility(boolean visibility)
    {
    	this.frame.setVisible(visibility);
    }
}