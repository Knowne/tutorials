package tutorial.spring.webservice.bsl;

import org.springframework.stereotype.Component;

import tutorial.spring.webservice.wsdl.generator.ws.Client;

@Component
public interface ClientBSL {

	public Client remClient(Integer nif);

	public Client getClient(Integer nif);

	public Client addClient(Client client);

}
