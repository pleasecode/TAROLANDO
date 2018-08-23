package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Configuracao {
	
	@Column(name = "COD_CONFIGURACAO")
	private Long codConfiguracao;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ATIVO")
	private boolean ativo;
	
	public Long getCodConfiguracao() {
		return codConfiguracao;
	}
	public void setCodConfiguracao(Long codConfiguracao) {
		this.codConfiguracao = codConfiguracao;
	}
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
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
