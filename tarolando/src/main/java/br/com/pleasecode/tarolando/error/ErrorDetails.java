package br.com.pleasecode.tarolando.error;

public class ErrorDetails {
	
	protected String titulo;
	protected int status;
	protected String detalhes;
	protected long momento;
	protected String classeError;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public long getMomento() {
		return momento;
	}
	public void setMomento(long momento) {
		this.momento = momento;
	}
	public String getClasseError() {
		return classeError;
	}
	public void setClasseError(String classeError) {
		this.classeError = classeError;
	}
	
}
