package com.classes.DTO;

public class Instrutor extends Pessoa{
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Instrutor -------------------------------------	
	
	private Pessoa instrutor;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Instrutor -------------------------------------	
	
	public Instrutor() {
		
	}
	
	public Instrutor(int codigo) {
		setCodigo(codigo);
		
	}
	
	public Instrutor(Pessoa instrutor) {
		setInstrutor(instrutor);
	}
	
	public Instrutor(String cpf) {
		setCpf(cpf);
	}
	
	public Instrutor(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public Instrutor(int codigo, String nome, String cpf) {
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Instrutor -------------------------------------	

	public Pessoa getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Pessoa instrutor) {
		this.instrutor = instrutor;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Instrutor -------------------------------------	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Instrutor [ Código = ");
		builder.append(super.getCodigo());
		builder.append(" , Instrutor = ");
		builder.append(super.getNome());
		builder.append(", Cpf = ");
		builder.append(super.getCpf());
		builder.append(" ]");
		return builder.toString();
	}

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
