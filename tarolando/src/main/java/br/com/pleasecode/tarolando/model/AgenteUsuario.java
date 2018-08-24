package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AgenteUsuario extends AbstractEntity {

	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	//@Column(name="COD_AGENTE")	
	//@Column(name="MOMENTO")
	@Column(name="USUARIO")
	private String usuario;
	@Column(name="SENHA")
	private String senha;
	@Column(name="ATIVO")
	private boolean ativo;

}
