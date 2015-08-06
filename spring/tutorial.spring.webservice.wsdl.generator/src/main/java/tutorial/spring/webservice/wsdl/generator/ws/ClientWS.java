package tutorial.spring.webservice.wsdl.generator.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import tutorial.spring.webservice.wsdl.generator.domain.Client;

@WebService
public interface ClientWS {

	public Client getClient(@WebParam(name = "nif") Integer nif);

	public Client addClient(@WebParam(name = "client") Client client);

	public Client remClient(@WebParam(name = "nif") Integer nif);

}
