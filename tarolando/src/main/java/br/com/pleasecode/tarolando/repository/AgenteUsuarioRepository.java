package br.com.pleasecode.tarolando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pleasecode.tarolando.model.Agente;
import br.com.pleasecode.tarolando.model.AgenteUsuario;

@Repository
public interface AgenteUsuarioRepository extends JpaRepository<AgenteUsuario, Long> {
	AgenteUsuario findByUsername(String username);
}
