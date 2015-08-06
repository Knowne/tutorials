package tutorial.spring.webservice.bsl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tutorial.spring.webservice.dao.ClientEntity;
import tutorial.spring.webservice.dao.repository.ClientRepository;
import tutorial.spring.webservice.wsdl.generator.ws.Client;

@Component
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

	@Override
	public List<Client> findClientByFirstName(String firstName) {
		List<ClientEntity> clients = clientRepository.findByFirstName(firstName);

		if (clients != null) {
			List<Client> listOfClients = new ArrayList<Client>();
			for (ClientEntity client : clients) {
				Client newClient = new Client();
				newClient.setFirstName(client.getFirstName());
				newClient.setLastName(client.getLastName());
				newClient.setEmail(client.getEmail());
				newClient.setNif(client.getNif());
				listOfClients.add(newClient);
			}
			return listOfClients;
		} else
			return null;
	}

}
