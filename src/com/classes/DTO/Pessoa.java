package com.classes.DTO;

public class Pessoa {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Pessoa -------------------------------------	
	
	private int codigo;
	private String nome;
	private String cpf;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Pessoa -------------------------------------	
	
	public Pessoa() {
		
	}
	
	public Pessoa(int codigo) {
		setCodigo(codigo);
	}
	
	public Pessoa(String cpf) {
		setCpf(cpf);
	}
	
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public Pessoa(int codigo, String nome, String cpf) {
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Pessoa -------------------------------------	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Pessoa -------------------------------------	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [ Código = ");
		builder.append(codigo);
		builder.append(", Nome = ");
		builder.append(nome);
		builder.append(", Cpf = ");
		builder.append(cpf);
		builder.append(" ]");
		return builder.toString();
	}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
