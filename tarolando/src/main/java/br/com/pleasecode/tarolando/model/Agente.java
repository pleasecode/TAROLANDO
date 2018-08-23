package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Agente implements Serializable {
	
	@Column(name="COD_AGENTE")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codAgente;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@OneToMany(mappedBy ="agente", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "agente", cascade = CascadeType.ALL)
	private List<Indicacao> indicacoes;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="SEXO")
	private String sexo;
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="RG")
	private String rg;
	
	@Column(name="NOME_MAE")
	private String nomeMae;
	
	@Column(name="EH_CLIENTE")
	private boolean ehCliente;
	
	@Column(name="EH_FUNCIONARIO")
	private boolean ehFuncionario;
	
	@Column(name="EH_INDICADOR")
	private boolean ehIndicador;
	
	@Column(name="DOCUMENTO_FOTO")
	private String documentoFoto;
	
	@Column(name="DOCUMENTO_TIPO")
	private String documentoTipo;
	
	@Column(name="IMAGEM_URL")
	private String imagemUrl;
	
	@Column(name="COD_PLANO")
	private int codPlano;
	
	@Column(name="ATIVO")
	private boolean ativo;

	public int getCodAgente() {
		return codAgente;
	}

	public void setCodAgente(int codAgente) {
		this.codAgente = codAgente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public boolean isEhCliente() {
		return ehCliente;
	}

	public void setEhCliente(boolean ehCliente) {
		this.ehCliente = ehCliente;
	}

	public boolean isEhFuncionario() {
		return ehFuncionario;
	}

	public void setEhFuncionario(boolean ehFuncionario) {
		this.ehFuncionario = ehFuncionario;
	}

	public boolean isEhIndicador() {
		return ehIndicador;
	}

	public void setEhIndicador(boolean ehIndicador) {
		this.ehIndicador = ehIndicador;
	}

	public String getDocumentoFoto() {
		return documentoFoto;
	}

	public void setDocumentoFoto(String documentoFoto) {
		this.documentoFoto = documentoFoto;
	}

	public String getDocumentoTipo() {
		return documentoTipo;
	}

	public void setDocumentoTipo(String documentoTipo) {
		this.documentoTipo = documentoTipo;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public int getCodPlano() {
		return codPlano;
	}

	public void setCodPlano(int codPlano) {
		this.codPlano = codPlano;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
	
	public List<Indicacao> getIndicacoes() {
		return indicacoes;
	}

	public void adicionaIndicacao(Indicacao indicacao) {
		this.indicacoes.add(indicacao);
		indicacao.setAgente(this);
	}
	
	public void adicionaEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
		endereco.setAgente(this);
	}

}
