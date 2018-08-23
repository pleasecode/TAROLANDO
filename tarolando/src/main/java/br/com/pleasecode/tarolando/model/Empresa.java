package br.com.pleasecode.tarolando.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empresa {
	
	@Column(name = "COD_EMPRESA")
	private Long codEmpresa;
	
	@OneToMany(mappedBy ="empresa", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<EmpresaPromocao> empresaPromocoes;
	
	@OneToMany(mappedBy = "empresa")
	private List<Indicacao> indicacoes;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
	@Column(name = "ATIVO")
	private boolean ativo;

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<EmpresaPromocao> getEmpresaPromocoes() {
		return empresaPromocoes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
	
	public void adicionaEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
		endereco.setEmpresa(this);
	}
	
	public void adicionaPromocao(EmpresaPromocao empresaPromocao) {
		this.empresaPromocoes.add(empresaPromocao);
		empresaPromocao.setEmpresa(this);
	}
	
	public void adicionaIndicacao(Indicacao indicacao) {
		this.indicacoes.add(indicacao);
		indicacao.setEmpresa(this);
	}

}
