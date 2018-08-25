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
public class Empresa extends AbstractEntity  {
	
//	@OneToMany(mappedBy ="empresa", cascade = CascadeType.ALL)
//	private List<Endereco> enderecos;
//	
//	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
//	private List<EmpresaPromocao> empresaPromocoes;
//	
//	@OneToMany(mappedBy = "empresa")
//	private List<Indicacao> indicacoes;
	
	@Column(name = "CNPJ")
	private String cnpj;

//	public List<Endereco> getEnderecos() {
//		return enderecos;
//	}
//
//	public void setEnderecos(List<Endereco> enderecos) {
//		this.enderecos = enderecos;
//	}
//
//	public List<EmpresaPromocao> getEmpresaPromocoes() {
//		return empresaPromocoes;
//	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
//	public void adicionaEndereco(Endereco endereco) {
//		this.enderecos.add(endereco);
//		endereco.setEmpresa(this);
//	}
//	
//	public void adicionaPromocao(EmpresaPromocao empresaPromocao) {
//		this.empresaPromocoes.add(empresaPromocao);
//		empresaPromocao.setEmpresa(this);
//	}
	
//	public void adicionaIndicacao(Indicacao indicacao) {
//		this.indicacoes.add(indicacao);
//		indicacao.setEmpresa(this);
//	}

}
