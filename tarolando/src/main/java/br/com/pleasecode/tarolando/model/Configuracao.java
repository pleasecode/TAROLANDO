package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Configuracao {
	
	@Column(name = "COD_CONFIGURACAO")
	private Long codConfiguracao;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "NOME")
	private String nome;
	@Column(name = "ATIVO")
	private boolean ativo;


}
