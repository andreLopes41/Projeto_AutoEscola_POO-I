package com.classes.DTO;

public class Veiculo {
	
	private int codigo;
	private String marca;
	
	public Veiculo() {

	}
	
	public Veiculo(int codigo) {
		setcodigo(codigo);
	}
	
	public Veiculo(String marca) {
		setMarca(marca);
	}
	
	public Veiculo(int codigo, String marca) {
		setcodigo(codigo);
		setMarca(marca);
	}

	public int getcodigo() {
		return codigo;
	}

	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [codigo=");
		builder.append(codigo);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}

}
