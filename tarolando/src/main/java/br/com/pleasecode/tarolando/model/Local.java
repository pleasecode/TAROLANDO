package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Local implements Serializable {
	@Column(name = "COD_LOCAL")
	private Long codLocal;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@ManyToOne
	@JoinColumn(name = "COD_SEGUIMENTO", referencedColumnName = "codSeguimento")
	private Seguimento seguimento;
	
	@ManyToMany
	@JoinTable(name = "LOCAL_ATIVIDADE", joinColumns = {@JoinColumn(name = "LOCAL_ID")}, inverseJoinColumns = {@JoinColumn(name = "ATIVIDADE_ID")})
	private List<Atividade> atividades;
	
	@OneToMany(mappedBy ="local", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "local")
	private List<Indicacao> indicacoes;
	
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
	
	public Long getCodLocal() {
		return codLocal;
	}

	public void setCodLocal(Long codLocal) {
		this.codLocal = codLocal;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Seguimento getSeguimento() {
		return seguimento;
	}

	public void setSeguimento(Seguimento seguimento) {
		this.seguimento = seguimento;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void adicionaEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
		endereco.setLocal(this);
	}
	
	public void adicionaAtividade(Atividade atividade) {
		List<Local> listaLocais = atividade.getLocais();
		
		this.atividades.add(atividade);
		if (listaLocais != null)
			atividade.getLocais().add(this);		
	}
	
	public void adicionaIndicacao(Indicacao indicacao) {
		this.indicacoes.add(indicacao);
		indicacao.setLocal(this);
	}
}
