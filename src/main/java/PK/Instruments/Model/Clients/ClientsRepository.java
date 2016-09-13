package PK.Instruments.Model.Clients;

import PK.Instruments.Model.Users.User;

public class ClientsRepository implements IClientsRepository{

//	UnitOfWork _unitOfWork;
	
	public ClientsRepository()
	{
//		_unitOfWork = unitOfWork;
	}
	
	public void add(Client client)
	{
//	    _unitOfWork.getSession().save(client);
	}

	public void remove(Client client) 
	{
//		 _unitOfWork.getSession().delete(client);
	}
	
	public void update(Client client) 
	{
//		 _unitOfWork.getSession().update(client);
	}
	
	public Client findById(int id)
	{
//		return _unitOfWork.getSession().get(Client.class, id);
	}
	
	public Client findByUser(User user)
	{
//		return _unitOfWork.getSession().byNaturalId(Client.class).using("_user",user).load();
	}

}