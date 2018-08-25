package br.com.pleasecode.tarolando.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pleasecode.tarolando.model.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long>{

}
