package PK.Instruments.Model.Lessons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import PK.Instruments.Model.Clients.Client;

@Entity
@SequenceGenerator(initialValue = 1, allocationSize=1, name = "lessons_ids", sequenceName = "lessons_ids")
@Table(name="lessons")
public class Lesson
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO, generator = "lessons_ids")
	@Column(name = "id")
	private int _id;
	
	@Column(name = "instrumentName")
	private String _instrumentName;
	
	@Column(name = "genre")
	private String _genre;
	
	@Column(name = "level")
	private String _level;
	
	@Column(name = "clasroom")
	private int _classroom;
	
	@Column(name = "day")
	private String _day;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Client _owner;
	
	public Lesson()
	{
	}
	
	public Lesson(String instrumentName,String genre, String level, int classroom, String day)
	{
		_instrumentName = instrumentName;
		_genre = genre;
		_level = level;
		_classroom = classroom;
		_day = day;
	}
	
	public String getInstrumentName()
	{
		return _instrumentName;
	}
	
	public void setInstrumentName(String instrumentName)
	{
		_instrumentName = instrumentName;
	}
	
	public String getGenre()
	{
		return _genre;
	}
	
	public void setGenre(String genre)
	{
		_genre = genre;
	}
	
	public String getLevel()
	{
		return _level;
	}
	
	public void setLevel(String level)
	{
		_level = level;
	}

	public int getClassroom()
	{
		return _classroom;
	}
	
	public void setClassroom(int classroom)
	{
		_classroom = classroom;
	}
	
	public String getDay()
	{
		return _day;
	}
	
	public void setDay(String day)
	{
		_day = day;
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
				"genre: "+ _genre + " " +
				"level: "+ _level + " " +
				"day: "+ _day + " " +
				"classroom: "+ _classroom + " ";
	}
	
	
}