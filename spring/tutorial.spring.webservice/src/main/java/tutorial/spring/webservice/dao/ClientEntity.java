package tutorial.spring.webservice.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientEntity {

	@Id
	@GeneratedValue
	private long id;

	private String firstName;

	private String lastName;

	private String email;

	private Integer nif;

	public ClientEntity() {
	}

	public ClientEntity(String firstName, String lastName, String email, Integer nif) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nif = nif;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return "Client: [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", nif=" + nif + "]";
	}
}
