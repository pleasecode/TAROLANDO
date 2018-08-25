package br.com.pleasecode.tarolando.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.pleasecode.tarolando.serializers.LocalListSerializer;
import br.com.pleasecode.tarolando.serializers.LocalSerializer;

//@JsonIgnoreProperties({"", ""})
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id" )
@Entity
public class Atividade extends AbstractEntity {
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "TIPO")
	private String tipo;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "IMAGEM_URL")	
	private String imagemUrl;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "COD_SEGUIMENTO", referencedColumnName = "id")
	private Seguimento seguimento;
	
	// mappedBy define o lado dominado no manyToMany bidirecional, ou seja, só serve pra mostrar a quem esse lado da relação pertence
	@ManyToMany(mappedBy = "atividades") 
	@JsonSerialize(using = LocalListSerializer.class)
	private List<Local> locais;
	
	@OneToMany(mappedBy = "atividade")
	private List<Indicacao> indicacoes;
	
	@OneToMany(mappedBy = "atividade")
	private List<Foto> fotos = new ArrayList<Foto>();

	public Seguimento getSeguimento() {
		return seguimento;
	}

	public void setSeguimento(Seguimento seguimento) {
		this.seguimento = seguimento;
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

	public List<Local> getLocais() {
		return locais;
	}

	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public List<Indicacao> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(List<Indicacao> indicacoes) {
		this.indicacoes = indicacoes;
	}
	
	public void adicionaLocal(Local local) {
		this.locais.add(local);
	}
}
