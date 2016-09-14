package PK.Instruments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import PK.Instruments.Model.Teachers.Teacher;

public class Teacher1Test {
	
	private Teacher teacher;

	
	@Before
	public void setUp() throws Exception {
		
		teacher = new Teacher("Lizzie", "Lavsie", "Miodowa 45", "456789012");
		
	}
	

	@Test
	public void testGetName() {
		
		String name = teacher.getName();
		
		assertEquals("Lizzie", name);
	}
		
}