package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empresa {
	
	@Column(name = "COD_EMPRESA")
	private Long codEmpresa;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
	@Column(name = "ATIVO")
	private boolean ativo;
	

}
