package com.classes.DTO;

public class Provas {
	
	private int codigo;
	private float nota;
	
	public Provas() {

	}
	
	public Provas(int codigo) {
		setCodigo(codigo);
	}
	
	public Provas(float nota) {
		setNota(nota);
	}
	
	public Provas(int codigo, float nota) {
		setCodigo(codigo);
		setNota(nota);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provas [codigo=");
		builder.append(codigo);
		builder.append(", nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}
	
}
