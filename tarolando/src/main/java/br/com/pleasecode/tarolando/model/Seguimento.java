package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Seguimento extends AbstractEntity {

	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "IMAGEM_URL")
	private String imagemUrl;
	
	@Column(name = "ATIVO")
	private boolean ativo;

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
