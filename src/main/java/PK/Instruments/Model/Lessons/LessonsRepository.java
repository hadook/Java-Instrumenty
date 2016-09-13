package PK.Instruments.Model.Lessons;

import java.util.List;

import PK.Instruments.Model.Clients.Client;

public class LessonsRepository implements ILessonsRepository{
	
//	UnitOfWork _unitOfWork;
	
	public LessonsRepository()
	{
//		_unitOfWork = unitOfWork;
	}
	
	public void add(Lesson lesson)
	{
//	    _unitOfWork.getSession().save(lesson);
	}

	public void remove(Lesson lesson) 
	{
//		 _unitOfWork.getSession().delete(patient);
	}
	
	public Lesson findById(int id)
	{
//		return _unitOfWork.getSession().get(Patient.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Lesson> findByOwner(Client client)
	{
//		return _unitOfWork.getSession().createQuery("select p from Patient p where _owner: ownerId").setParameter("ownerId",client.getId()).getResultList();
	}
}