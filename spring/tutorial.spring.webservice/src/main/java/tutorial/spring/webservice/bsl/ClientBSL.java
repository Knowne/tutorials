package tutorial.spring.webservice.bsl;

import java.util.List;

import org.springframework.stereotype.Component;

import tutorial.spring.webservice.wsdl.generator.ws.Client;

@Component
public interface ClientBSL {

	public Client remClient(Integer nif);

	public Client getClient(Integer nif);

	public Client addClient(Client client);

	public List<Client> findClientByFirstName(String firstName);

	public List<Client> findAllClients();

}
