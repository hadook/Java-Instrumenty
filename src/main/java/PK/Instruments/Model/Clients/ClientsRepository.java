package PK.Instruments.Model.Clients;

import PK.Instruments.Data.Database;
import PK.Instruments.Model.Users.User;

public class ClientsRepository implements IClientsRepository{
	
	private Database _data = Database.getInstance();
	
	public void add(Client client)
	{
		_data.clients.add(client);
	}

	public void remove(Client client) 
	{
		_data.clients.remove(client);
	}
	
	public Client findById(int id)
	{
		for(Client client : _data.clients)
		{
			if(client.getId() == id)
				return client;
		}
		
		throw new NullPointerException("Nie odnaleziono klienta o id: "+id);
	}
		
	public Client findByNameAndSurname(String name, String surname)
	{
		for(Client client : _data.clients)
		{
			if(client.getName().equals(name) && client.getSurname().equals(surname))
				return client;
		}
		
		throw new NullPointerException("Nie odnaleziono klienta o imieniu: " + name + " i nazwisku: " + surname);
	}
	
	public Client findByUser(User user)
	{
		for(Client client: _data.clients)
		{
			if(client.getUser().equals(user))
				return client;
		}
		
		throw new NullPointerException("Nie odnaleziono uzytkownika.");
	}
/*	
	public Client findByEmail(String email)
	{
		for(Client client : _data.clients)
		{
			if(client.compareEmail(email))
				return client;
		}
		
		throw new NullPointerException("Nie odnaleziono klienta o emailu: " + email);
	}
*/
}