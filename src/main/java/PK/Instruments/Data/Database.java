package PK.Instruments.Data;

import java.util.HashSet;

import PK.Instruments.Model.Clients.Client;
import PK.Instruments.Model.Teachers.Teacher;
import PK.Instruments.Model.Lessons.Lesson;
import PK.Instruments.Model.Users.User;

public class Database {
	
	/*
	 * @param Integer - unique teacher's id
	 * @param Teacher - teacher's object
	 */
	public HashSet<Teacher> teachers = new HashSet<Teacher>();
	public HashSet<Client> clients = new HashSet<Client>();
	public HashSet<Lesson> lessons = new HashSet<Lesson>();
	public HashSet<User> users = new HashSet<User>();
	//add other data sets here
	
	private static Database _database;	
	
	//important!
	private Database(){};
	
	public static Database getInstance()
	{
		if(_database == null)
		{
			_database = new Database();
		}
		
		return _database;
	}
	
}