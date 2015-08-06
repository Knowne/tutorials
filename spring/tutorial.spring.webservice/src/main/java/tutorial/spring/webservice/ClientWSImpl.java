package tutorial.spring.webservice;

import javax.jws.WebService;

import tutorial.spring.webservice.wsdl.generator.ws.Client;
import tutorial.spring.webservice.wsdl.generator.ws.ClientWS;

@WebService(endpointInterface = "tutorial.spring.webservice.wsdl.generator.ws.ClientWS")
public class ClientWSImpl implements ClientWS {

	@Override
	public Client remClient(Integer nif) {
		if (nif == 12345678) {
			Client client = new Client();
			client.setFirstName("João");
			client.setLastName("Monteiro");
			client.setEmail("joao.monteiro@email.com");
			client.setNif(nif);
			return client;
		} else
			return null;
	}

	@Override
	public Client getClient(Integer nif) {
		if (nif == 12345678) {
			Client client = new Client();
			client.setFirstName("João");
			client.setLastName("Monteiro");
			client.setEmail("joao.monteiro@email.com");
			client.setNif(12345678);
			return client;
		} else
			return null;
	}

	@Override
	public Client addClient(Client client) {
		return client;
	}

}
