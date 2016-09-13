package PK.Instruments.Model.Lessons;

import java.util.ArrayList;

import PK.Instruments.Data.Database;

public class LessonsRepository implements ILessonsRepository{

	private Database _data = Database.getInstance();
	
	public void add(Lesson lesson)
	{
		_data.lessons.add(lesson);
	}

	public void remove(Lesson lesson) 
	{
		_data.lessons.remove(lesson);
	}
	
	public Lesson findById(int id)
	{
		for(Lesson lesson : _data.lessons)
		{
			if(lesson.getId() == id)
				return lesson;
		}
		
		throw new NullPointerException("Nie odnaleziono kursu o id: "+id);
	}
	
	public Lesson findByInstrumentName(String instrumentName)
	{
		for(Lesson lesson : _data.lessons)
		{
			if(lesson.getInstrumentName() == instrumentName)
				return lesson;
		}
		
		throw new NullPointerException("Nie odnaleziono kursu z instrumentem: "+ instrumentName);
	}

	public Lesson findByDay(String day)
	{
		for(Lesson lesson : _data.lessons)
		{
			if(lesson.getDay() == day)
				return lesson;
		}
		
		throw new NullPointerException("Nie odnaleziono kursu w dniu: "+ day);
	}

	public Lesson findByClassroom(int classroom)
	{
		for(Lesson lesson : _data.lessons)
		{
			if(lesson.getClassroom() == classroom)
				return lesson;
		}
		
		throw new NullPointerException("Nie odnaleziono kursu w sali: "+ classroom);
	}
	
	public Lesson[] findByOwnerId(int ownerId)
	{
		ArrayList<Lesson> lessons = new ArrayList<Lesson>();
		for(Lesson lesson : _data.lessons)
		{
			if(lesson.getOwnerId() == ownerId)
				lessons.add(lesson);
		}
		
		return lessons.toArray(new Lesson[lessons.size()]);
	}
	
	public Lesson[] findAll()
	{
		return _data.lessons.toArray(new Lesson[_data.lessons.size()]);
	}
	
}