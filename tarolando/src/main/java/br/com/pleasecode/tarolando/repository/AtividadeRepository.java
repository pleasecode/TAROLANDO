package br.com.pleasecode.tarolando.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.pleasecode.tarolando.model.Atividade;

public interface AtividadeRepository extends CrudRepository<Atividade, Long>{

}
