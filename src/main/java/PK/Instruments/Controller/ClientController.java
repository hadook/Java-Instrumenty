package PK.Instruments.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PK.Instruments.Model.Model;
import PK.Instruments.Model.Users.User;
import PK.Instruments.View.ClientView.ClientAddCourseBox;
import PK.Instruments.View.ClientView.ClientSeeCourseBox;
import PK.Instruments.View.ClientView.ClientWelcomeBox;


public class ClientController {
	private User user;
	private Model model;
	private ClientWelcomeBox welcomeView;
	private ClientAddCourseBox addCourse;
	private ClientSeeCourseBox seeCourse;
	
	
	private ActionListener changeToSeeCourseListener;
	private ActionListener changeToAddCourseListener;
	private ActionListener backToWelcomeListener;
	private ActionListener addCourseListener;
	
	public ClientController(Model model,User user)
	{
		this.model = model;
		this.user = user;
		this.welcomeView = new ClientWelcomeBox();
		this.addCourse = new ClientAddCourseBox();
		this.seeCourse = new ClientSeeCourseBox();

		this.welcomeView.setVisibility(true);
		this.addCourse.setVisibility(false);
		this.seeCourse.setVisibility(false);
	}
    
	
    private void changeToSeeCourseAction()
    {   
    	this.seeCourse.updateLessons(this.model.findLessonsByUser(this.user));
    	this.welcomeView.setVisibility(false);
    	this.seeCourse.setVisibility(true);
    }
    
    private void changeToAddCourseAction()
    {             
    	this.welcomeView.setVisibility(false);
    	this.addCourse.setVisibility(true);
    }
    
    private void changeToWelcomeAction()
    {
    	this.addCourse.setVisibility(false);
    	this.seeCourse.setVisibility(false);
    	this.welcomeView.setVisibility(true);
    }
    
    private void addLessonAction()
    {      
        String instrumentName = this.addCourse.getCourseData(0);
        String genre = this.addCourse.getCourseData(1);
        String level = this.addCourse.getCourseData(2);
        String classroom = this.addCourse.getCourseData(3);
        String day = this.addCourse.getCourseData(4);
    	
        model.createLesson(user,instrumentName,genre,level,classroom,day);
    	this.addCourse.setVisibility(false);
    	this.welcomeView.setVisibility(true);
    }

    public void configure()
	{        
    	changeToSeeCourseListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  changeToSeeCourseAction();
              }
        };                
        welcomeView.seeCourse().addActionListener(changeToSeeCourseListener);   
    
    
	    changeToAddCourseListener = new ActionListener() 
	    {
	          public void actionPerformed(ActionEvent actionEvent) 
	          {                  
	        	  changeToAddCourseAction();
	          }
	    };                
	    welcomeView.addCourse().addActionListener(changeToAddCourseListener);   
	    
	    
	    backToWelcomeListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  changeToWelcomeAction();
              }
        };                
        this.addCourse.getBackToWelcomeButton().addActionListener(backToWelcomeListener);   
        this.seeCourse.getBackToWelcomeButton().addActionListener(backToWelcomeListener);
        
        addCourseListener = new ActionListener() 
	    {
	          public void actionPerformed(ActionEvent actionEvent) 
	          {                  
	        	  addLessonAction();
	          }
	    };                
	    this.addCourse.getAddCourseButton().addActionListener(addCourseListener);  
	}
}