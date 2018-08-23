package br.com.pleasecode.tarolando.model;

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
public class Atividade {
	
	@Column(name = "COD_ATIVIDADE")
	private Long codAtividade;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;

	@ManyToOne(optional = false)
	@JoinColumn(name = "COD_SEGUIMENTO", referencedColumnName = "codSeguimento")
	private Seguimento seguimento;
	
	@ManyToMany
	private List<Local> locais;
	
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
	

}
