package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Indicacao {
	
	@Column(name = "COD_INDICACAO")
	private Long codIndicacao;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "COD_EMPRESA")
	@Column(name = "COD_AGENTE")
	@Column(name = "COD_LOCAL")
	@Column(name = "COD_ATIVIDADE")
	@Column(name = "TX_LUCRO")
	private double tx_lucro;
	@Column(name = "VALOR_ATIVIDADE")
	private double valorAtividade;
	@Column(name = "ATIVO")
	private boolean ativo;


}
