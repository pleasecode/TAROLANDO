package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cidade {
	
	@Columnlumn(name = "COD_CIDADE")
	private Long codCidade;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "NOME")
	private String nome;
	@Column(name = "COD_ESTADO")
	@Column(name = "ATIVO")
	private boolean ativo;


}
