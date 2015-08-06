package tutorial.spring.webservice.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tutorial.spring.webservice.dao.repository.ClientRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app-context-test.xml")
public class ClientBSLTest {

	@Autowired
	private ClientRepository clientRepository;

	@Test
	public void testRemClient() {
		clientRepository.count();
	}

	@Test
	public void testGetClient() {
	}

	@Test
	public void testAddClient() {
	}

}
