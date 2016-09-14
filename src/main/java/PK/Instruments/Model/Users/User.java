package PK.Instruments.Model.Users;

import PK.Instruments.Model.Item;

public class User extends Item
{
	private static int _idCounter;
	private String _email;
	private String _password;
	
	
	public User()
	{
	}
	
	public User(String email)
	{
		_id = _idCounter++;
		_email = email;
	}
	
	public User(String email, String password)
	{
		_id = _idCounter++;
		_email = email;
		_password = password;
	}
	
	public String getEmail() 
	{
	      return _email;
	}
	  
	public void setEmail( String email ) 
	{
	      _email = email;
	}
	
	public String getPassword() 
	{
	      return _password;
	}
	  
	public void setPassword( String password ) 
	{
		_password = password;
	}
	
	public String toString()
	{
		return 
				"User: " +
				"id: " + Integer.toString(_id) + " " + 
				"email: " + _email + " "
				;
		
	}
	
}