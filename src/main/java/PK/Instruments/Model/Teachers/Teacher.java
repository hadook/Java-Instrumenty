package PK.Instruments.Model.Teachers;

import PK.Instruments.Model.Item;
import PK.Instruments.Model.Users.User;

public class Teacher extends Item{
	private static int _idCounter;
	private String _name;
	private String _surname;
	private String _address;
	private String _phone;
	private User _user;
	
	public Teacher(String name, String surname, String address, String phone)
	{
		_id = _idCounter++;
		_name = name;
		_surname = surname;
		_address = address;
		_phone = phone;
	}
	
	public Teacher(String name, String surname)
	{
		_id = _idCounter++;
		_name = name;
		_surname = surname;
	}
	
	public Teacher(String name, String surname, String address, String phone, User user)
	{
		_id = _idCounter++;
		_name = name;
		_surname = surname;
		_address = address;
		_phone = phone;
		_user = user;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void setName(String name)
	{
		_name = name;
	}
	
	public String getSurname()
	{
		return _surname;
	}
	
	public void setSurname(String surname)
	{
		_surname = surname;
	}
	
	public String getAddress()
	{
		return _address;
	}
	
	public void setAddress(String address)
	{
		_address = address;
	}

	public String getPhone()
	{
		return _phone;
	}
	
	public void setPhone(String phone)
	{
		_phone = phone;
	}
	
	public User getUser() {
        return _user;
    }

    public void setUser(User user) {
        _user = user;
    }
	
	public String toString()
	{
		return 
				Integer.toString(_id) + " " + 
				_name + " " + 
				_surname + " "+
				_address + " "+
				_phone + " ";
		
	}

}