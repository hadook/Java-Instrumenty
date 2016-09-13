package PK.Instruments.Model.Lessons;

import PK.Instruments.Model.IRepository;

public interface ILessonsRepository extends IRepository<Lesson>{
	Lesson findByInstrumentName(String instrumentName);
	Lesson findByDay(String day);
	Lesson findByClassroom(int classroom);	// perhaps Integer class required?
	Lesson[] findByOwnerId(int ownerId);
	Lesson[] findAll();
}