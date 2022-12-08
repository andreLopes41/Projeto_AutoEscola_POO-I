package com.classes.DTO;

public class Veiculo {
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Veiculo -------------------------------------		
	
	private int codigo;
	private String tipo;
	private String marca;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Veiculo -------------------------------------
	
	public Veiculo() {

	}
	
	public Veiculo(int codigo) {
		setCodigo(codigo);
	}
	
	public Veiculo(String marca) {
		setMarca(marca);
	}
	
	public Veiculo(String tipo, String marca) {
		setTipo(tipo);
		setMarca(marca);
	}
	
	public Veiculo(int codigo, String tipo, String marca) {
		setCodigo(codigo);
		setTipo(tipo);
		setMarca(marca);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Veiculo -------------------------------------		

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Veiculo -------------------------------------		

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [ Código = ");
		builder.append(codigo);
		builder.append(" , Tipo = ");
		builder.append(tipo);
		builder.append(" , Marca = ");
		builder.append(marca);
		builder.append(" ]");
		return builder.toString();
	}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////