package PK.Instruments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import PK.Instruments.Model.Clients.Client;

public class Client1Test {

	Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client("Mateusz", "Ziemniak", "Grobowa 33", "12345");
	}


	@Test
	public void testGetAdress() {
		String adres = client.getAdress();
		assertEquals("Grobowa 33", adres);
	}

}