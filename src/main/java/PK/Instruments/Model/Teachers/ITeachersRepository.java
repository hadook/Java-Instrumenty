package PK.Instruments.Model.Teachers;

import PK.Instruments.Model.IRepository;
import PK.Instruments.Model.Users.User;

public interface ITeachersRepository extends IRepository<Teacher>{
	public Teacher findByNameAndSurname(String name, String surname);
	public Teacher findByUser(User user);
}