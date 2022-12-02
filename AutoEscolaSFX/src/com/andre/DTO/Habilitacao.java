package com.classes.DTO;

public class Habilitacao {
	
	private String categoria;
	private int numero;
	
	public Habilitacao() {

	}
	
	public Habilitacao(int numero) {
		setNumero(numero);
	}
	
	public Habilitacao(String categoria) {
		setCategoria(categoria);
	}
	
	public Habilitacao(int numero, String categoria) {
		setNumero(numero);
		setCategoria(categoria);
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Habilitacao [categoria=");
		builder.append(categoria);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
}
