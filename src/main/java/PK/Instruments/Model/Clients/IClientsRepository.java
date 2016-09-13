package PK.Instruments.Model.Clients;

import PK.Instruments.Model.IRepository;
import PK.Instruments.Model.Users.User;
import PK.Instruments.Model.Clients.Client;

public interface IClientsRepository extends IRepository<Client>{
	public Client findByNameAndSurname(String name, String surname);
//	public Client findByEmail(String email);
	public Client findByUser(User user);
//	public void update(Client client);
}