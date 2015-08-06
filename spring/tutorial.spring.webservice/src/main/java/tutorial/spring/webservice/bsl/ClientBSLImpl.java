package tutorial.spring.webservice.bsl;

import org.springframework.beans.factory.annotation.Autowired;

import tutorial.spring.webservice.dao.ClientEntity;
import tutorial.spring.webservice.dao.repository.ClientRepository;
import tutorial.spring.webservice.wsdl.generator.ws.Client;

public class ClientBSLImpl implements ClientBSL {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client remClient(Integer nif) {
		ClientEntity client = clientRepository.findByNif(nif);

		if (client != null) {
			clientRepository.delete(client);
			Client removedClient = new Client();
			removedClient.setFirstName(client.getFirstName());
			removedClient.setLastName(client.getLastName());
			removedClient.setEmail(client.getEmail());
			removedClient.setNif(client.getNif());
			return removedClient;
		} else
			return null;
	}

	@Override
	public Client getClient(Integer nif) {
		ClientEntity client = clientRepository.findByNif(nif);

		if (client != null) {
			Client removedClient = new Client();
			removedClient.setFirstName(client.getFirstName());
			removedClient.setLastName(client.getLastName());
			removedClient.setEmail(client.getEmail());
			removedClient.setNif(client.getNif());
			return removedClient;
		} else
			return null;
	}

	@Override
	public Client addClient(Client client) {
		if (clientRepository.findByNif(client.getNif()) == null) {
			clientRepository.save(new ClientEntity(client.getFirstName(), client.getLastName(), client.getEmail(), client.getNif()));
			return client;
		} else
			return null;
	}

}
