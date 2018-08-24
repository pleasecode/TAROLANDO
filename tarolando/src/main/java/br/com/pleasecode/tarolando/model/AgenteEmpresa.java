package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AgenteEmpresa extends AbstractEntity {
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	//private Agente agente;
		
	//private Empresa empresa;
	
	@Column(name = "ATIVO")
	private boolean ativo;



	
	
	
}
