package PK.Instruments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import PK.Instruments.Model.Lessons.Lesson;

public class Lesson1Test {

	Lesson lesson;

	@Before
	public void setUp() throws Exception {
		
		lesson = new Lesson("fortepian", "zaawansowany", 108, "wtorek", 0);
	}



	@Test
	public void testSetLevel() {
		Lesson testlesson = new Lesson("gitara", "zaawansowany", 112, "sroda", 0);
		testlesson.setLevel("zaawansowany");
		assertEquals(lesson.getLevel(), testlesson.getLevel());
		
	}

}