package PK.Instruments.Model.Users;

import PK.Instruments.Model.IRepository;

public interface IUsersManager extends IRepository<User>{
	public User register(String email, String password);
	public User login(String email, String password);
}