package br.com.pleasecode.tarolando.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Local {
	@Column(name = "COD_LOCAL")
	private Long codLocal;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@OneToMany
	private Seguimento seguimento;
	
	@ManyToMany
	private List<Atividade> atividades;
	
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
