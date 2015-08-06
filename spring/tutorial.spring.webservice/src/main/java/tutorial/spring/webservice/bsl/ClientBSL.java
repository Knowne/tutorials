package tutorial.spring.webservice.bsl;

import tutorial.spring.webservice.wsdl.generator.ws.Client;

public interface ClientBSL {

	public Client remClient(Integer nif);

	public Client getClient(Integer nif);

	public Client addClient(Client client);

}
