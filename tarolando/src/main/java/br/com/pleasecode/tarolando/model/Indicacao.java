package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
@Entity
public class Indicacao extends AbstractEntity {

	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@ManyToOne
	@JoinColumn(name = "cod_empresa", referencedColumnName = "id")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "cod_agente", referencedColumnName = "id")
	private Agente agente;
		
	@ManyToOne
	@JoinColumn(name = "cod_atividade", referencedColumnName = "id")
	private Atividade atividade;
	
	@ManyToOne
	@JoinColumn(name = "cod_local", referencedColumnName = "id")
	private Local local;	

	@Column(name = "TX_LUCRO")
	private double tx_lucro;
	
	@Column(name = "VALOR_ATIVIDADE")
	private double valorAtividade;
	
	@Column(name = "ATIVO")
	private boolean ativo;

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
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

	public double getTx_lucro() {
		return tx_lucro;
	}

	public void setTx_lucro(double tx_lucro) {
		this.tx_lucro = tx_lucro;
	}

	public double getValorAtividade() {
		return valorAtividade;
	}

	public void setValorAtividade(double valorAtividade) {
		this.valorAtividade = valorAtividade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

}
