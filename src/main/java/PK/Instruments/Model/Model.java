package PK.Instruments.Model;

import java.util.List;

import PK.Instruments.Model.Clients.Client;
import PK.Instruments.Model.Clients.ClientsRepository;
import PK.Instruments.Model.Clients.IClientsRepository;
import PK.Instruments.Model.Teachers.Teacher;
import PK.Instruments.Model.Teachers.TeachersRepository;
import PK.Instruments.Model.Teachers.ITeachersRepository;
import PK.Instruments.Model.Lessons.Lesson;
import PK.Instruments.Model.Lessons.LessonsRepository;
import PK.Instruments.Model.Lessons.ILessonsRepository;
import PK.Instruments.Model.Users.User;
import PK.Instruments.Model.Users.UsersManager;
import PK.Instruments.Model.Users.IUsersManager;

public class Model {

	public User registerUser(String email,String password,String name,String surname,String address,String phone,String type)
	{		
		IUsersManager usersManager = new UsersManager();
		User user = usersManager.register(email,password);
		
		if(type.equals("teacher"))
		{
			System.out.println("Registering teacher.");
			ITeachersRepository teachersRepository = new TeachersRepository();
			Teacher teacher = new Teacher(name,surname,address,phone);
			teacher.setUser(user);
			teachersRepository.add(teacher);
		}
		else if(type.equals("client"))
		{
			System.out.println("Registering client");
			IClientsRepository clientsRepository = new ClientsRepository();
			Client client = new Client(name,surname,address,phone);
			client.setUser(user);
			clientsRepository.add(client);
		}
		else
		{
			throw new RuntimeException("Unsupported user type.");
		}
		
		if(user != null)
		{
			System.out.println("Registration successful.");
			return user;
		}
			
		System.out.println("Couldn't register user, try different email.");
		return null;
	}
	
	public User loginUser(String email, String password)
	{
		IUsersManager usersManager = new UsersManager();
		User user = usersManager.login(email,password);
		
		if(user != null)
		{
			System.out.println("User logged in correctly.");
			return user;
		}
			
		System.out.println("Couldn't log in, incorrect email or password.");
		return null;
	}
	
	public Teacher findTeacherByUser(User user)
	{
		ITeachersRepository teachersRepository = new TeachersRepository();
		Teacher teacher = teachersRepository.findByUser(user);
		
		if(teacher != null)
		{
			System.out.println("Teacher has been found.");
			return teacher;
		}
			
		System.out.println("Couldn't find teacher.");
		return null;
	}
	
	public List<Lesson> findLessonsByUser(User user)
	{	
		IClientsRepository clientsRepository = new ClientsRepository();
		Client client = clientsRepository.findByUser(user);
		List<Lesson> lessons = client.getLessons();

		return lessons;
	}
	
	public void createLesson(User user,String instrumentName,String level,String classroom,String day)
	{
		IClientsRepository clientsRepository = new ClientsRepository();
		Client client = clientsRepository.findByUser(user);
		
		Lesson lesson = new Lesson(instrumentName,level,Integer.parseInt(classroom),day,ownerId);
		lesson.setOwnerId(client);
		client.addLesson(lesson);
		
		ILessonsRepository lessonsRepository = new LessonsRepository();
		lessonsRepository.add(lesson);
		
		clientsRepository.update(client);
	}
}