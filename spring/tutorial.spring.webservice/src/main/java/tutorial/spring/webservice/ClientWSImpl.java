package tutorial.spring.webservice;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import tutorial.spring.webservice.bsl.ClientBSL;
import tutorial.spring.webservice.wsdl.generator.ws.Client;
import tutorial.spring.webservice.wsdl.generator.ws.ClientWS;

@WebService(endpointInterface = "tutorial.spring.webservice.wsdl.generator.ws.ClientWS")
public class ClientWSImpl implements ClientWS {

	@Autowired
	private ClientBSL clientBSL;

	@Override
	public Client remClient(Integer nif) {
		if (nif != null)
			return clientBSL.remClient(nif);
		else
			return null;
	}

	@Override
	public Client getClient(Integer nif) {
		if (nif != null)
			return clientBSL.getClient(nif);
		else
			return null;
	}

	@Override
	public Client addClient(Client client) {
		if (client != null)
			return clientBSL.addClient(client);
		else
			return null;
	}

	@Override
	public List<Client> findClientByFirstName(String firstName) {
		if (firstName != null) {
			return clientBSL.findClientByFirstName(firstName);
		} else
			return null;
	}

}
