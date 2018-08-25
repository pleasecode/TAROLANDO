package br.com.pleasecode.tarolando.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.pleasecode.tarolando.serializers.AgenteSerializer;
import br.com.pleasecode.tarolando.serializers.AtividadeSerializer;
import br.com.pleasecode.tarolando.serializers.LocalSerializer;

//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
@Entity
public class Indicacao extends AbstractEntity {

//	@ManyToOne
//	@JoinColumn(name = "cod_empresa", referencedColumnName = "id")
//	private Empresa empresa;
//	
	@ManyToOne
	@JoinColumn(name = "cod_agente", referencedColumnName = "id")
	@JsonSerialize(using = AgenteSerializer.class)
	private Agente agente;
		
	@ManyToOne
	@JoinColumn(name = "cod_atividade", referencedColumnName = "id")
	@JsonSerialize(using = AtividadeSerializer.class)
	private Atividade atividade;
	
	@ManyToOne
	@JoinColumn(name = "cod_local", referencedColumnName = "id")
	@JsonSerialize(using = LocalSerializer.class)
	private Local local;

	@Column(name = "TX_LUCRO")
	private double tx_lucro;
	
	@Column(name = "VALOR_ATIVIDADE")
	private double valorAtividade;

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

}
