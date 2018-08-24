package br.com.pleasecode.tarolando.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.pleasecode.tarolando.model.Indicacao;

public interface IndicacaoRepository extends CrudRepository<Indicacao, Long> {
	
}