package com.classes.DTO;

public class Aluno extends Pessoa {
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Aluno -------------------------------------	
	
	private Pessoa aluno;
	private String categoriaCNH;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Aluno -------------------------------------
	
	public Aluno() {
		
	}
	
	public Aluno(int codigo) {
		setCodigo(codigo);
	}
	
	public Aluno(Pessoa aluno) {
		setAluno(aluno);
	}
	
	public Aluno(String cpf) {
		setCpf(cpf);
	}
	
	public Aluno(String nome, String cpf, String categoriaCNH) {
		setNome(nome);
		setCpf(cpf);
		setCategoriaCNH(categoriaCNH);
	}
	
	public Aluno(int codigo, String nome, String cpf, String categoriaCNH) {
		setCodigo(codigo);
		setNome(nome);
		setCpf(cpf);
		setCategoriaCNH(categoriaCNH);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Aluno -------------------------------------	

	public Pessoa getAluno() {
		return aluno;
	}

	public void setAluno(Pessoa aluno) {
		this.aluno = aluno;
	}

	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Aluno -------------------------------------	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [Código = ");
		builder.append(super.getCodigo());
		builder.append(" , Aluno = ");
		builder.append(super.getNome());
		builder.append(", Cpf = ");
		builder.append(super.getCpf());
		builder.append(" , CategoriaCNH = ");
		builder.append(categoriaCNH);
		builder.append(" ]");
		return builder.toString();
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
