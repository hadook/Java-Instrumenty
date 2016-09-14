package PK.Instruments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import PK.Instruments.Model.Model;
import PK.Instruments.Model.Users.User;

public class Model2Test {

	
	Model model;
	
	@Before
	public void setUp() throws Exception {
	
		model = new Model();
	}

	

	@Test
	public void testLoginUser() {
		User testuser = model.loginUser("dyzio@lipna.lipa", "1234");
		assertEquals(testuser, null);
	}

}