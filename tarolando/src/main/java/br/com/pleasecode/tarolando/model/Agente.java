package br.com.pleasecode.tarolando.model;

import javax.persistence.Entity;

@Entity
public class Agente {
	private int codAgente;
	private String nome;
	private String email;
	private String sexo;
	private String cpf;
	private String rg;
	private String nomeMae;
	private boolean ehCliente;
	private boolean ehFuncionario;
	private boolean ehIndicador;
	private String documentoFoto;
	private String documentoTipo;
	private String imagemUrl;	
	private int codPlano;
	private boolean ativo;

}
