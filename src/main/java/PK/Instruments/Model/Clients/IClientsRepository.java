package PK.Instruments.Model.Clients;

import PK.Instruments.Model.IRepository;

public interface IClientsRepository extends IRepository<Client>{
	Client findByNameAndSurname(String name, String surname);
//	Client findByEmail(String email);
}