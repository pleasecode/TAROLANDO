package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estado implements Serializable {
	
	@Column(name = "COD_ESTADO")
	private Long codEstado;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@OneToMany(mappedBy = "estado")
	private List<Cidade> cidades;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "SIGLA")
	private String sigla;
	
	@Column(name = "ATIVO")
	private boolean ativo;
	
	
	public Long getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Long codEstado) {
		this.codEstado = codEstado;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void adicionaCidade(Cidade cidade) {
		this.cidades.add(cidade);
		cidade.setEstado(this);
	}
}
