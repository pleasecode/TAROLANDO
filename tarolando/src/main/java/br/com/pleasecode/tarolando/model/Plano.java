package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Plano extends AbstractEntity {
	
	@Column(name = "DATA")
	@Temporal(TemporalType.DATE)
	private Date data;
		
	@Column(name = "HORA")
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "PRECO")
	private double preco;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "IMAGEM_URL")
	private String imagemUrl;
}
