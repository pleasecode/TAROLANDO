package br.com.pleasecode.tarolando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pleasecode.tarolando.model.Atividade;
import br.com.pleasecode.tarolando.model.Indicacao;

@Repository
public interface IndicacaoRepository extends JpaRepository<Indicacao, Long> {
	
}
