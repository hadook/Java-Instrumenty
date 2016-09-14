package PK.Instruments.Utils;

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

public class ExampleLoader {
	public static void loadWholeData()
	{
		// teacher users
		User user0 = new User("adam@gmail.com", "haslo00");
		User user1 = new User("antoni@gmail.com", "haslo01");
		User user2 = new User("alfons@gmail.com", "haslo02");
		User user3 = new User("adrian@gmail.com", "haslo03");
		User user4 = new User("arek@gmail.com", "haslo04");
		// client users
		User user5 = new User("bartek@gmail.com", "haslo10");
		User user6 = new User("boguslaw@gmail.com", "haslo11");
		User user7 = new User("bernard@gmail.com", "haslo12");
		User user8 = new User("blazej@gmail.com", "haslo13");
		User user9 = new User("bezprym@gmail.com", "haslo14");
		
		Teacher teacher0 = new Teacher("Adam","Bogucki","Skorochow 19","888 888 880", user0);
		Teacher teacher1 = new Teacher("Antoni","Bak","Radzikowice 7","888 888 881", user1);
		Teacher teacher2 = new Teacher("Alfons","Nosol","Nysa 19/27","888 888 882", user2);
		Teacher teacher3 = new Teacher("Adrian","Mitrega","Nysa 65","888 888 883", user3);
		Teacher teacher4 = new Teacher("Arek","Orlowski","Otmuchow 4","888 888 884", user4);
		
		Client client0 = new Client("Bartek","Broniewski","Otmuchow 16/2","666 666 660", user5);
		Client client1 = new Client("Boguslaw","Linda","Warszawa 16/2","666 666 661", user6);
		Client client2 = new Client("Bernard","Franczewski","Nysa 57","666 666 662", user7);
		Client client3 = new Client("Blazej","Ziemniak","Skorochow 7","666 666 663", user8);
		Client client4 = new Client("Bezprym","Gniewosz","Mikulovice 4","666 666 664", user9);
		
		Lesson lesson0 = new Lesson("gitara","poczatkujacy",107,"poniedzialek",client0);
		Lesson lesson1 = new Lesson("fortepian","zaawansowany",108,"sroda",client1);
		Lesson lesson2 = new Lesson("gitara","ekspert",107,"czwartek",client2);
		Lesson lesson3 = new Lesson("perkusja","poczatkujacy",013,"wtorek",client3);
		Lesson lesson4 = new Lesson("kontrabas","zaawansowany",006,"poniedzialek",client4);
		
		client0.addLesson(lesson0);
		client0.addLesson(lesson2);
		client0.addLesson(lesson4);
		client1.addLesson(lesson1);
		client2.addLesson(lesson2);
		client3.addLesson(lesson3);
		client4.addLesson(lesson4);
		client4.addLesson(lesson1);
		
		
		IUsersManager users = new UsersManager();
		ITeachersRepository teachers = new TeachersRepository();
		IClientsRepository clients = new ClientsRepository();
		ILessonsRepository lessons = new LessonsRepository();
		
		users.add(user0);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		users.add(user7);
		users.add(user8);
		users.add(user9);
		
		teachers.add(teacher0);
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		teachers.add(teacher4);
		
		clients.add(client0);
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		clients.add(client4);
		
		lessons.add(lesson0);
		lessons.add(lesson1);
		lessons.add(lesson2);
		lessons.add(lesson3);
		lessons.add(lesson4);
	}
}