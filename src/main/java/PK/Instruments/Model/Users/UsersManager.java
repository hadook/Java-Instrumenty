package PK.Instruments.Model.Users;

import PK.Instruments.Data.Database;

public class UsersManager implements IUsersManager
{
	private Database _data = Database.getInstance();
	
	public UsersManager()
	{
		
	}
	
	public void add(User user)
	{
		_data.users.add(user);
	}

	public void remove(User user) 
	{
		_data.users.remove(user);
	}
	
	public User initiate(String email)
	{
		for(User user : _data.users)
		{
			if(user.getEmail() == email)
				return user;
		}
		return null;
	}
	
	public User register(String email, String password)
	{
		User user = initiate(email);
		
		if(user != null) // if user email already exists
			return null; //don't allow any registration
		
		//otherwise let him register and keep logged
	    user = new User(email);
	    user.setPassword(password);
	    
	    return user;
	}
	
	public User login(String email, String password)
	{
		User user = initiate(email);
		
		if(user == null) //can't find user with such email
			return null;
		
		if(!isPasswordValid(user,password)) //password incorrect
			return null;
		
		return user;
	} 
	
	public User findById(int id)
	{
		for(User user : _data.users)
		{
			if(user.getId() == id)
				return user;
		}
		
		throw new NullPointerException("Nie odnaleziono nauczyciela o id: "+id);
	}
	
	private boolean isPasswordValid(User user, String password)
	{
		if(user.getPassword().equals(password))
			return true;
		
		return false;
	}
}