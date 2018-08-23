package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estado {
	
	@Column(name = "COD_ESTADO")
	private Long codEstado;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "NOME")
	private String nome;
	@Column(name = "SIGLA")
	private String sigla;
	@Column(name = "ATIVO")
	private boolean ativo;

}
