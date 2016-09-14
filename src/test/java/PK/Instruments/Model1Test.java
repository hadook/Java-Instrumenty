package PK.Instruments;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import PK.Instruments.Model.Model;
import PK.Instruments.Model.Users.User;

public class Model1Test {

	User user;
	Model model;

	@Before
	public void setUp() throws Exception {
		user = new User();
		model = new Model();
	}
	
	private String randomString()
	{
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}

		return sb.toString();
	}

	@Test
	public void testRegisterUser() {
		String email = randomString();
		user = model.registerUser(email, "kicia12", "Liv", "Montez", "Miodowa 12", "1234", "client");
		User testuser = model.loginUser(email, "kicia12");
		assertEquals(testuser.getEmail(), user.getEmail());
	}

}