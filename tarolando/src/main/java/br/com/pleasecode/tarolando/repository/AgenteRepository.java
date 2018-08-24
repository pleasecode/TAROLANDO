package br.com.pleasecode.tarolando.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.pleasecode.tarolando.model.Agente;

public interface AgenteRepository extends CrudRepository<Agente, Long>{

	List<Agente> findByName(String nome);
}
