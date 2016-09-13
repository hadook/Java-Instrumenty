package PK.Instruments.Model.Teachers;

import java.util.List;

import PK.Instruments.Model.IRepository;
import PK.Instruments.Model.Users.User;

public interface ITeachersRepository extends IRepository<Teacher>{
	public Teacher findByUser(User user);
	public List<Teacher> findAll();
}