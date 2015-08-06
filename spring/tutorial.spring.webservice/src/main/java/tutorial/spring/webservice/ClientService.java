package tutorial.spring.webservice;

import javax.jws.WebService;

import tutorial.spring.wsdl.generator.ws.Client;
import tutorial.spring.wsdl.generator.ws.ClientWS;

@WebService(endpointInterface="tutorial.spring.webservice.wsdl.generator.ClientWS")
public class ClientService implements ClientWS {

	@Override
	public Client remClient(Integer nif) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClient(Integer nif) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}
