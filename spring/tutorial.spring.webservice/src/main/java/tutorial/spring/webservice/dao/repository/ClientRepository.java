package tutorial.spring.webservice.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tutorial.spring.webservice.dao.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

	public ClientEntity findByNif(Integer nif);

}
