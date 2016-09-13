package PK.Instruments.Model.Lessons;

import PK.Instruments.Model.Item;
import PK.Instruments.Model.Clients.Client;

public class Lesson extends Item{
	private static int _idLesson;
	private String _instrumentName;
	private String _level;
	private int _classroom;
	private String _day;
	private int _ownerId;
	private Client _owner;
	
	public Lesson(String instrumentName, String level, int classroom, String day, int ownerId)
	{
		_id = _idLesson++;
		_instrumentName = instrumentName;
		_level = level;
		_classroom = classroom;
		_day = day;
		_ownerId = ownerId;
	}
	
	public Lesson(String instrumentName, String level, int classroom, String day, Client owner)
	{
		_id = _idLesson++;
		_instrumentName = instrumentName;
		_level = level;
		_classroom = classroom;
		_day = day;
		_owner = owner;
	}
	
	public String getInstrumentName()
	{
		return _instrumentName;
	}
	
	public void setInstrumentName(String instrumentName)
	{
		_instrumentName = instrumentName;
	}
	
	public String getLevel()
	{
		return _level;
	}
	
	public void setLevel(String level)
	{
		_level = level;
	}
	
	public String getDay()
	{
		return _day;
	}
	
	public void setDay(String day)
	{
		_day = day;
	}
	
	public int getClassroom()
	{
		return _classroom;
	}
	
	public void setClassroom(int classroom)
	{
		_classroom = classroom;
	}
	
	public int getOwnerId()
	{
		return _ownerId;
	}
	
	public void setOwnerId(int ownerId)
	{
		_ownerId = ownerId;
	}
	
	public Client getOwner()
	{
		return _owner;
	}
	
	public void setOwner(Client owner)
	{
		_owner = owner;
	}
	
	public String toString()
	{
		return 
				Integer.toString(_id) + " " + 
				"instrument name: "+ _instrumentName + " " +
				"level: "+ _level + " " +
				"day: "+ _day + " " +
				"classroom: "+ _classroom + " ";
	}
}