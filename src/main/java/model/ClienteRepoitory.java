package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepoitory extends CrudRepository<Cliente, Long>{
	

}
