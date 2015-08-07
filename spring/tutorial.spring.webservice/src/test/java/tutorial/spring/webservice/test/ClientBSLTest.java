package tutorial.spring.webservice.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tutorial.spring.webservice.bsl.ClientBSL;
import tutorial.spring.webservice.wsdl.generator.ws.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app-context-test.xml")
public class ClientBSLTest {

	@Autowired
	private ClientBSL clientBSL;

	@Before
	public void setUp() {

		Client client = clientBSL.getClient(12345678);

		if (client == null) {
			Client newClient = new Client();
			newClient.setFirstName("João");
			newClient.setLastName("Monteiro");
			newClient.setEmail("joao.monteiro@email.com");
			newClient.setNif(12345678);

			Assert.assertNotNull(clientBSL.addClient(newClient));
		}

	}

	@Test
	public void testAddClient() {

		Client newClient = new Client();
		newClient.setFirstName("FirstName");
		newClient.setLastName("SecondName");
		newClient.setEmail("email@email.com");
		newClient.setNif(87654321);

		newClient = clientBSL.addClient(newClient);

		Assert.assertNotNull(newClient);

		Assert.assertTrue(newClient.getFirstName().equals("FirstName"));
		Assert.assertTrue(newClient.getLastName().equals("SecondName"));
		Assert.assertTrue(newClient.getEmail().equals("email@email.com"));
		Assert.assertTrue(newClient.getNif() == 87654321);
	}

	@Test
	public void testGetClient() {

		// This checks that last method (add) was called and there is one user
		// on the database.
		Client client = clientBSL.getClient(12345678);

		Assert.assertNotNull(client);

		Assert.assertTrue(client.getFirstName().equals("João"));
		Assert.assertTrue(client.getLastName().equals("Monteiro"));
		Assert.assertTrue(client.getEmail().equals("joao.monteiro@email.com"));
	}

	@Test
	public void testFindClientByFirstName() {

		List<Client> clients = clientBSL.findClientByFirstName("João");

		Assert.assertEquals(1, clients.size());

		clients = clientBSL.findClientByFirstName("Client");

		Assert.assertEquals(0, clients.size());

		Client newClient = new Client();
		newClient.setFirstName("João");
		newClient.setLastName("LastName");
		newClient.setEmail("Email");
		newClient.setNif(34567890);

		newClient = clientBSL.addClient(newClient);

		Assert.assertNotNull(newClient);

		clients = clientBSL.findClientByFirstName("João");

		Assert.assertEquals(2, clients.size());

	}

	@Test
	public void testRemClient() {

		Client removedClient = clientBSL.remClient(12345678);

		Assert.assertNotNull(removedClient);

		Assert.assertTrue(removedClient.getFirstName().equals("João"));
		Assert.assertTrue(removedClient.getLastName().equals("Monteiro"));
		Assert.assertTrue(removedClient.getEmail().equals("joao.monteiro@email.com"));

		List<Client> clients = clientBSL.findClientByFirstName("João");

		Assert.assertEquals(1, clients.size());

	}

}
