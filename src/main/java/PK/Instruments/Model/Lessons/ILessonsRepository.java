package PK.Instruments.Model.Lessons;

import java.util.List;

import PK.Instruments.Model.IRepository;
import PK.Instruments.Model.Clients.Client;

public interface ILessonsRepository extends IRepository<Lesson>{
	public List<Lesson> findByOwner(Client client);
}