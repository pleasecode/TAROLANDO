package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Seguimento {
	
	@Column(name = "COD_SEGUIMENTO")
	private Long codSeguimento;

	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "NOME")
	private String nome;
	@Column(name = "IMAGEM_URL")
	private String imagemUrl;
	@Column(name = "ATIVO")
	private boolean ativo;

}
