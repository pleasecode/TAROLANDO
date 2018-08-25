package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Seguimento extends AbstractEntity {
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "IMAGEM_URL")
	private String imagemUrl;

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


}
