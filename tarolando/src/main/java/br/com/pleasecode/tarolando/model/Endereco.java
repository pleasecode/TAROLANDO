package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Endereco {
	
	@Column(name = "COD_ENDERECO")
	COD_AGENTE
	COD_EMPRESA
	COD_LOCAL
	COD_ATIVIDADE
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "RUA")
	private String rua;
	@Column(name = "CIDADE")
	private String cidade;
	@Column(name = "ESTADO")
	private String estado;
	@Column(name = "CEP")
	private String cep;
	@Column(name = "LATITUDE")
	private String latitude;
	@Column(name = "LONGITUDE")
	private long longitude;
	@Column(name = "ATIVO")
	private boolean ativo;

}
