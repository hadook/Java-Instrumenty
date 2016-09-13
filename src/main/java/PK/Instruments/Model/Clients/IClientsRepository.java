package PK.Instruments.Model.Clients;

import PK.Instruments.Model.IRepository;
import PK.Instruments.Model.Users.User;

public interface IClientsRepository extends IRepository<Client>{
	public Client findByUser(User user);
	public void update(Client client);
}