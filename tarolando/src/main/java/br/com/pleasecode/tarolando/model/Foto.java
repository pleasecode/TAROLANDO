package br.com.pleasecode.tarolando.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.pleasecode.tarolando.serializers.AtividadeSerializer;
import br.com.pleasecode.tarolando.serializers.FotoSerializer;
import br.com.pleasecode.tarolando.serializers.LocalSerializer;

@Entity
public class Foto extends AbstractEntity{
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "IMAGEM_URL")
	private String imagemUrl;
	
	@ManyToOne
	@JoinColumn(name = "COD_ATIVIDADE", referencedColumnName = "id")
	@JsonSerialize(using = AtividadeSerializer.class)
	private Atividade atividade;
	
	@ManyToOne
	@JoinColumn(name = "COD_LOCAL", referencedColumnName = "id")
	@JsonSerialize(using = LocalSerializer.class)
	private Local local;

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

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
}
