package PK.Instruments.Model.Teachers;

import java.util.ArrayList;

import PK.Instruments.Data.Database;
import PK.Instruments.Model.Users.User;

public class TeachersRepository implements ITeachersRepository{
	
	private Database _data = Database.getInstance();
	
	public void add(Teacher teacher)
	{
		_data.teachers.add(teacher);
	}

	public void remove(Teacher teacher) 
	{
		_data.teachers.remove(teacher);
	}
	
	public Teacher findById(int id)
	{
		for(Teacher teacher : _data.teachers)
		{
			if(teacher.getId() == id)
				return teacher;
		}
		
		throw new NullPointerException("Nie odnaleziono nauczyciela o id: "+id);
	}
		
	public Teacher findByNameAndSurname(String name, String surname)
	{
		for(Teacher teacher : _data.teachers)
		{
			if(teacher.getName().equals(name) && teacher.getSurname().equals(surname))
				return teacher;
		}
		
		throw new NullPointerException("Nie odnaleziono nauczyciela o imieniu: " + name + " i nazwisku: " + surname);
	}
	
	public Teacher findByUser(User user)
	{
		for(Teacher teacher: _data.teachers)
		{
			if(teacher.getUser().equals(user))
				return teacher;
		}
		return null;
	}
	
	public Teacher[] findAll()
	{
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		for(Teacher teacher : _data.teachers)
		{
			teachers.add(teacher);
		}
		
		return teachers.toArray(new Teacher[teachers.size()]);
	}
	
}