package br.com.pleasecode.tarolando.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonIgnoreProperties({"", ""})
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id" )
@Entity
public class Atividade extends AbstractEntity {

	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "COD_SEGUIMENTO", referencedColumnName = "id")
	private Seguimento seguimento;
	
	// mappedBy define o lado dominado no manyToMany bidirecional, ou seja, só serve pra mostrar a quem esse lado da relação pertence
	
	@ManyToMany(mappedBy = "atividades") 
	private Set<Local> locais;
	
	@OneToMany(mappedBy = "atividade")
	private List<Indicacao> indicacoes;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
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

	public Seguimento getSeguimento() {
		return seguimento;
	}

	public void setSeguimento(Seguimento seguimento) {
		this.seguimento = seguimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	@JsonBackReference
	public Set<Local> getLocais() {
		return locais;
	}

	public void setLocais(Set<Local> locais) {
		this.locais = locais;
	}

	public List<Indicacao> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(List<Indicacao> indicacoes) {
		this.indicacoes = indicacoes;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
	
}
