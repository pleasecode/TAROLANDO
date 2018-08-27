package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.pleasecode.tarolando.serializers.AgenteSerializer;

@Entity
public class AgenteUsuario extends AbstractEntity {
	
	
	@JsonIgnore
	@Override
	public Date getMomento() {
		// TODO Auto-generated method stub
		return super.getMomento();
	}
	
	@JsonIgnore
	@Override
	public boolean isAtivo() {
		// TODO Auto-generated method stub
		return super.isAtivo();
	}



	@Column(name="USERNAME", unique = true)
	private String username;
	
	@Column(name="SENHA")
	@JsonIgnore
	private String senha;
	
	@OneToOne
	@JoinColumn(name = "COD_AGENTE", referencedColumnName = "id")
	@JsonSerialize(using=AgenteSerializer.class)
	private Agente agente;
	
	@Column(name="ADMIN")
	@JsonIgnore
	private boolean admin;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	

}
