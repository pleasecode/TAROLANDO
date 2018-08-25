package br.com.pleasecode.tarolando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pleasecode.tarolando.model.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{
}
