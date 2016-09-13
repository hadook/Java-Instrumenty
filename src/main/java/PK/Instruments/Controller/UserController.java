package PK.Instruments.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import PK.Instruments.Model.Model;
import PK.Instruments.Model.Teachers.Teacher;
import PK.Instruments.Model.Users.User;
import PK.Instruments.View.UserView.LoginBox;
import PK.Instruments.View.UserView.RegistrationBox;

public class UserController {
	
	private Model model;
	private LoginBox loginView;
	private RegistrationBox registrationView;
	
	private ActionListener loginActionListener;
	private ActionListener changeViewToRegisterActionListener;
	private ActionListener registerActionListener;
	
	public UserController(Model model)
	{
		this.model = model;
		this.loginView = new LoginBox();
		this.registrationView = new RegistrationBox();
		
		this.registrationView.setVisibility(false);
		this.loginView.setVisibility(true);
	}
	
    private void changeViewToRegisterAction()
    {             
    	this.loginView.setVisibility(false);
    	this.registrationView.setVisibility(true);
    }
	
    private void loginAction()
    {      
    	String email = this.loginView.getEmail();
    	String haslo = this.loginView.getPassword();
    	
    	User user = this.model.loginUser(email,haslo);
    	Teacher teacher = this.model.findTeacherByUser(user); //probuje znalezc nauczyciela z takim id jak user
    	if(user != null)
    	{
    		this.loginView.setVisibility(false);
    		if(teacher == null)
    			ContextManager.changeContext(user,"client");
    		else
    			ContextManager.changeContext(user,"teacher");
    		
    		return;
    	}
    	
    	this.loginView.addLabel();
    	System.out.println("Couldn't login user, email and password combination incorrect.");
		return;
    }  
    
    private void registerAction()
    {             
    	String name = this.registrationView.getPersonalData(0);
    	String surname = this.registrationView.getPersonalData(1);
    	String address = this.registrationView.getPersonalData(2);
    	String phone = this.registrationView.getPersonalData(3);
    	String email = this.registrationView.getPersonalData(4);
    	String password = new String(this.registrationView.getPassword());
    	String password2 = new String(this.registrationView.getConfirmation());
    	String type = this.registrationView.getType();
    	
    	if(!password.equals(password2))
    	{
    		System.out.println("Passwords are not identical!");
    		this.registrationView.addLabel();
    		return;
    	}
    	
    	User user = this.model.registerUser(email,password,name,surname,address,phone,type);
    	if(user != null)
    	{
    		this.registrationView.setVisibility(false);
    		ContextManager.changeContext(user,type);
    		return;
    	}
    	
    	this.registrationView.addLabel();
    	System.out.println("Couldn't register user, try different email.");
		return;
    }
	
    
    public void configure()
	{        
        loginActionListener = new ActionListener() 
        {
			public void actionPerformed(ActionEvent actionEvent) 
            {     
				loginAction();
            }
        };                
        loginView.logowanie().addActionListener(loginActionListener); 
        
        registerActionListener = new ActionListener() 
        {
        	public void actionPerformed(ActionEvent actionEvent) 
            {                  
        		registerAction();
            }
        };  
        registrationView.getButton().addActionListener(registerActionListener);
      
        
        changeViewToRegisterActionListener = new ActionListener() 
        {
            public void actionPerformed(ActionEvent actionEvent) 
            {                  
            	changeViewToRegisterAction();
            }
        };                
        loginView.rejestracja().addActionListener(changeViewToRegisterActionListener);   
    }
}