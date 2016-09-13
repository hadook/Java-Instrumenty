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