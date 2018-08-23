package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Atividade implements Serializable{
	
	@Column(name = "COD_ATIVIDADE")
	private Long codAtividade;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;

	@ManyToOne(optional = true)
	@JoinColumn(name = "COD_SEGUIMENTO", referencedColumnName = "codSeguimento")
	private Seguimento seguimento;
	
	
	// mappedBy define o lado dominado no manyToMany bidirecional, ou seja, só serve pra mostrar a quem esse lado da relação pertence
	@ManyToMany(mappedBy = "atividades") 
	@JoinColumn(name = "cod_local", referencedColumnName = "codLocal")
	private List<Local> locais;
	

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

	public Long getCodAtividade() {
		return codAtividade;
	}

	public void setCodAtividade(Long codAtividade) {
		this.codAtividade = codAtividade;
	}

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
	
	

}
