package br.com.pleasecode.tarolando.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Agente {
	
	@Column(name="COD_AGENTE")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codAgente;
	
	@Column(name="MOMENTO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date momento;
	
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

}
