package br.com.pleasecode.tarolando.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.pleasecode.tarolando.model.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}
