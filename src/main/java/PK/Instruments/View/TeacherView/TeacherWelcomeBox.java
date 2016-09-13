package PK.Instruments.View.TeacherView;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

import javax.swing.*;

import java.util.Date;
import java.text.DateFormat;

public class TeacherWelcomeBox
{
	JPanel card;
    JLabel label, labelx, label2, label1;
    JButton daneosobowe, listakursow, biura, calendar;
    JFrame frame;
    
    public TeacherWelcomeBox()
    {
    	//Create and set up the window.
        frame = new JFrame("Witaj!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Create and set up the content pane.
        addComponentToPane(frame.getContentPane());
       
        //Display the window.
        //frame.pack();
        frame.setSize(290,330);
        frame.setResizable(false);
        frame.setVisible(false);
    }
     
    public void addComponentToPane(Container pane) 
    {
      
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
        card = new JPanel();
        card.setBackground(new Color(220, 236, 237));
        //card.setLayout(new BorderLayout());
        calendar = new JButton("           Moj Terminarz            ");
        // calendar.setBounds(20, 100, 40, 40);
        // calendar.setBorder(null);

        daneosobowe = new JButton("     Moje Dane Osobowe     ");
        listakursow = new JButton("Moje lekcje instrumentow");
        biura = new JButton("   Lista sal konsultacji  ");
                  
        label = new JLabel("Witamy na stronie glownej!");
        labelx = new JLabel(dateFormat.format(date));
       // labelx.setLocation(200, 200);
        
        card.add(label);
       
        card.add(daneosobowe);
        card.add(calendar);
        card.add(listakursow);
        card.add(biura);
        
        card.add(labelx);
        
        
       // Create the panel that contains the "cards".
       
        pane.add(card, BorderLayout.CENTER);
    }
     
    public void itemStateChanged(ItemEvent evt) 
    {
        CardLayout cl = (CardLayout)(card.getLayout());
        cl.show(card, (String)evt.getItem());
    }
     
    public JButton daneOsobowe()
    {
    	return daneosobowe;
    }
    
    public JButton ListaKursow()
    {
    	return listakursow;
    }
    
    public JButton Biura()
    {
    	return biura;
    }
    
    public JButton Calendar()
    {
    	return calendar;
    }
    
    public void setVisibility(boolean visibility)
    {
    	this.frame.setVisible(visibility);
    }
}