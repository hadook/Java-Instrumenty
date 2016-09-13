package PK.Instruments.Controller;

import PK.Instruments.Model.Model;
import PK.Instruments.Model.Users.User;

public class ContextManager {
	private static Model model;
	private static UserController userController;
	private static ClientController clientController;
	private static TeacherController teacherController;
	private static ContextManager contextManager;
	
	private ContextManager()
	{
	}
	
	public static ContextManager getInstance()
	{
		if(contextManager == null)
			contextManager = new ContextManager();
		
		return contextManager;
	}
	
	public static void changeContext(User user,String type)
	{
		if(type.equals("client"))
		{
			userController = null;
			clientController = new ClientController(model,user);
			clientController.configure(); 
		}
		else if(type.equals("teacher"))
		{
			userController = null;
			teacherController = new TeacherController(model,user);
			teacherController.configure(); 
		}
		else
		{
			throw new RuntimeException("Failed to switch the context.");
		}
			
	}
	
	public void run()
	{
		model = new Model();
		userController = new UserController(model); //default context
		userController.configure(); 
	}

}