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

/*
package PK.Instruments.Model.Users;

import PK.Instruments.Model.Item;

public class User
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO, generator = "users_ids")
	@Column(name = "id")
	protected int _id;
	
	@NaturalId
	@Column(name = "email",length=128,unique=true)
	protected String _email;
	
	@Column(name = "salt",length=64)
	protected String _salt;
	
	@Column(name = "password",length=128)
	protected String _hashedPassword;
	
	
	public User()
	{
	}
	
	public User(String email)
	{
		_email = email;
	}
	
	public int getId() 
	{
	      return _id;
	}
	  
	public void setId( int id ) 
	{
	      _id = id;
	}
	
	public String getEmail() 
	{
	      return _email;
	}
	  
	public void setEmail( String email ) 
	{
	      _email = email;
	}
	
	public String getHashedPassword() 
	{
	      return _hashedPassword;
	}
	  
	public void setHashedPassword( String hashedPassword ) 
	{
		_hashedPassword = hashedPassword;
	}
	
	public String getSalt() 
	{
	      return _salt;
	}
	  
	public void setSalt( String salt ) 
	{
	      _salt = salt;
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
*/