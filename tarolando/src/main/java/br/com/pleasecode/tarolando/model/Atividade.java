package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	private List<Local> locais;
	
	@OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
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
	

	public List<Indicacao> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(List<Indicacao> indicacoes) {
		this.indicacoes = indicacoes;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public void setSeguimento(Seguimento seguimento) {
		this.seguimento = seguimento;
	}

	public List<Local> getLocais() {
		return locais;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
	
	public void adicionaIndicacao(Indicacao indicacao) {
		this.indicacoes.add(indicacao);
		indicacao.setAtividade(this);
	}
	
	public void adicionaLocais(Local local) {		
		this.locais.add(local);
		local.adicionaAtividade(this);
	}
}
