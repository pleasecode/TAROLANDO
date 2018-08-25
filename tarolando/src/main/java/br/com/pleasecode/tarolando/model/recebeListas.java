package br.com.pleasecode.tarolando.model;

import java.io.Serializable;
import java.util.List;

public class recebeListas implements Serializable {

	private List<Local> locais;
	private List<Indicacao> indicoes;
	public List<Local> getLocais() {
		return locais;
	}
	public void setLocais(List<Local> locais) {
		this.locais = locais;
	}
	public List<Indicacao> getIndicoes() {
		return indicoes;
	}
	public void setIndicoes(List<Indicacao> indicoes) {
		this.indicoes = indicoes;
	}
	
}
