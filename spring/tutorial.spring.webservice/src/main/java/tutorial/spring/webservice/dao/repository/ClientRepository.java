package tutorial.spring.webservice.dao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tutorial.spring.webservice.dao.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

	public ClientEntity findByNif(Integer nif);
	
	public List<ClientEntity> findByFirstName(String name);

}
