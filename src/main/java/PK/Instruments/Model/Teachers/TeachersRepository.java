package PK.Instruments.Model.Teachers;

import java.util.ArrayList;

import PK.Instruments.Data.Database;

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

/*
package PK.Instruments.Model.Teachers;

import java.util.List;

import PK.Instruments.Model.UnitOfWork;
import PK.Instruments.Model.Users.User;

public class TeachersRepository implements ITeachersRepository{
	
//	UnitOfWork _unitOfWork;
	
	public TeachersRepository()
	{
//		_unitOfWork = unitOfWork;
	}
	
	public void add(Teacher teacher)
	{
//	    _unitOfWork.getSession().save(teacher);
	}

	public void remove(Teacher teacher) 
	{
//		 _unitOfWork.getSession().delete(teacher);
	}
	
	public Teacher findById(int id)
	{
//		return _unitOfWork.getSession().get(Teacher.class, id);
	}
	
	public Teacher findByUser(User user)
	{
//		return _unitOfWork.getSession().byNaturalId(Teacher.class).using("_user",user).load();
	}
	
	@SuppressWarnings("unchecked")
	public List<Teacher> findAll()
	{
//		List<Teacher> teachers = _unitOfWork.getSession().createQuery("select d from Doctor d").getResultList();
		return teachers;
	}
}
*/