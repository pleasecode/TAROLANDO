package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
@Entity
public class Local extends AbstractEntity {

	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;

	@ManyToOne
	@JoinColumn(name = "COD_SEGUIMENTO", referencedColumnName = "id")
	private Seguimento seguimento;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "LOCAL_ATIVIDADE", joinColumns = {@JoinColumn(name = "LOCAL_ID")}, inverseJoinColumns = {@JoinColumn(name = "ATIVIDADE_ID")})
	private Set<Atividade> atividades;
		
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
	
	@OneToMany(mappedBy = "local")
	private List<Indicacao> indicacoes = new ArrayList<Indicacao>();
	
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
	@JsonManagedReference
	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Indicacao> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(List<Indicacao> indicacoes) {
		this.indicacoes = indicacoes;
	}
}
