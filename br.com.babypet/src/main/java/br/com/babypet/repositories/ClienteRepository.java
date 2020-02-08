package br.com.babypet.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.babypet.domain.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

	boolean existsByCpf(String cpf);

	Optional<Cliente> findByCpf(String cpf);

	List<Cliente> findByNomeContainsIgnoreCase(String nome);

	@Query(value = "{" 
	        + "$or: " 
			+ " [ "
			+ "            { 'nome': { $regex: '?0', '$options': 'i' } }"
			+ "            { 'email': { $regex: '?1', '$options': 'i' } }" 
			+ "        ]" 
			+ "    }" )

	List<Cliente> findByArgumentos(String nome, String email);

}
