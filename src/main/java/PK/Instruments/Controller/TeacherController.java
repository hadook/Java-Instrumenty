package PK.Instruments.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import PK.Instruments.Model.Model;
import PK.Instruments.Model.Teachers.Teacher;
import PK.Instruments.Model.Lessons.Lesson;
import PK.Instruments.Model.Users.User;
import PK.Instruments.View.TeacherView.TeacherCourses;
import PK.Instruments.View.TeacherView.TeacherOffice;
import PK.Instruments.View.TeacherView.TeacherDetails;
import PK.Instruments.View.TeacherView.TeacherSeeAgenda;
import PK.Instruments.View.TeacherView.TeacherWelcomeBox;



public class TeacherController {
	private User user;
	private Model model;
	private TeacherWelcomeBox welcomeView;
	private TeacherSeeAgenda personalCalendar;
	private TeacherOffice personalOffice;
	private TeacherDetails personalData;
	private TeacherCourses personalCourses;
	
	private ActionListener seePersonalCalendarListener;
	private ActionListener seePersonalOfficeListener;
	private ActionListener seePersonalDataListener;
	private ActionListener seePersonalCoursesListener;
	private ActionListener backToWelcomeListener;
	
	public TeacherController(Model model,User user)
	{
		List<Lesson> lessons = new ArrayList<Lesson>();
		
		this.model = model;
		this.user = user;
		this.welcomeView = new TeacherWelcomeBox();
		this.personalCalendar = new TeacherSeeAgenda();
		this.personalOffice = new TeacherOffice();
		this.personalData = new TeacherDetails();
		this.personalCourses = new TeacherCourses(lessons);
		
		this.welcomeView.setVisibility(true);
		this.personalCalendar.setVisibility(false);
		this.personalOffice.setVisibility(false);
		this.personalData.setVisibility(false);
		this.personalCourses.setVisibility(false);
	}
    
    private void seePersonalCalendarAction()
    {             
    	this.welcomeView.setVisibility(false);
    	this.personalCalendar.setVisibility(true);
    }

    private void seePersonalOfficeAction()
    {             
    	this.welcomeView.setVisibility(false);
    	this.personalOffice.setVisibility(true);
    }
    
    private void seePersonalDataAction()
    {             
    	Teacher teacher = this.model.findTeacherByUser(user);
    	this.personalData.setDetails(teacher.getName(), teacher.getSurname(), teacher.getAddress(), teacher.getPhone());
    	this.welcomeView.setVisibility(false);
    	this.personalData.setVisibility(true);
    }
    
    private void seePersonalCoursesAction()
    {             
    	this.welcomeView.setVisibility(false);
    	this.personalCourses.setVisibility(true);
    }
    
    private void seeWelcomeAction()
    {
    	this.personalCourses.setVisibility(false);
    	this.personalData.setVisibility(false);
    	this.personalOffice.setVisibility(false);
    	this.personalCalendar.setVisibility(false);
    	this.welcomeView.setVisibility(true);
    }
    
    
    
    public void configure()
	{        
    	seePersonalCalendarListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  seePersonalCalendarAction();
              }
        };                
        welcomeView.Calendar().addActionListener(seePersonalCalendarListener);   
        
        seePersonalOfficeListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  seePersonalOfficeAction();
              }
        };                
        welcomeView.Biura().addActionListener(seePersonalOfficeListener);   
        
        seePersonalDataListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  seePersonalDataAction();
              }
        };                
        welcomeView.daneOsobowe().addActionListener(seePersonalDataListener);   
        
        seePersonalCoursesListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  seePersonalCoursesAction();
              }
        };                
        welcomeView.ListaKursow().addActionListener(seePersonalCoursesListener);   
        
        backToWelcomeListener = new ActionListener() 
        {
              public void actionPerformed(ActionEvent actionEvent) 
              {                  
            	  seeWelcomeAction();
              }
        };                
        personalCourses.getBackToWelcomeButton().addActionListener(backToWelcomeListener);   
        personalCalendar.getBackToWelcomeButton().addActionListener(backToWelcomeListener);   
        personalData.getBackToWelcomeButton().addActionListener(backToWelcomeListener);   
        personalOffice.getBackToWelcomeButton().addActionListener(backToWelcomeListener);   
    }
}