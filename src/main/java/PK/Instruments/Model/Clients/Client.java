package PK.Instruments.Model.Clients;

import java.util.ArrayList;
import java.util.List;

import PK.Instruments.Model.Item;
import PK.Instruments.Model.Users.User;
import PK.Instruments.Model.Lessons.Lesson;

public class Client extends Item{
	private static int _idCounter;
	private String _name;
	private String _surname;
	private String _adress;
	private String _phone;
	private User _user;
	private List<Lesson> _lessons = new ArrayList<Lesson>();
	
	public Client(String name, String surname, String adress, String phone)
	{
		_id = _idCounter++;
		_name = name;
		_surname = surname;
		_adress = adress;
		_phone = phone;
//		_email = email;
	}
	
	public Client(String name, String surname, String adress, String phone, User user)
	{
		_id = _idCounter++;
		_name = name;
		_surname = surname;
		_adress = adress;
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

	public String getAdress()
	{
		return _adress;
	}
	
	public void setAdress(String adress)
	{
		_adress = adress;
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
/*	
	public String getEmail()
	{
		return _email;
	}
	
	public void setEmail(String email)
	{
		_email = email;
	}
	
	public boolean compareEmail(String email)
	{
		return _email.equals(email);
	}
*/
    public List<Lesson> getLessons() {
        return _lessons;
    }

    public void addLesson(Lesson lesson) {
        _lessons.add(lesson);
        lesson.setOwner(this);
    }

    public void removeLesson(Lesson lesson) {
    	_lessons.remove(lesson);
    	lesson.setOwner(null);
    }
	
	public String toString()
	{
		return 
				Integer.toString(_id) + " " + 
				_name + " " + 
				_surname + " "+
				_adress + " "+
				_phone + " ";
//				_email + " ";
	}

}