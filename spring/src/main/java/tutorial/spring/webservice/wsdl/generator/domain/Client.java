package tutorial.spring.webservice.wsdl.generator.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Client {

	private String firstName;

	private String lastName;

	private String email;

	private Integer nif;

	public Client() {
	}

	public Client(String firstName, String lastName, String email, Integer nif) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nif = nif;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNif() {
		return nif;
	}

	public void setNif(Integer nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Client");
		sb.append("FirstName: " + firstName);
		sb.append("LastName: " + lastName);
		sb.append("Email: " + email);
		sb.append("Nif: " + nif);

		return sb.toString();
	}

}
