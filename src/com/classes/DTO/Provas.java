package com.classes.DTO;

import java.util.Date;

public class Provas {
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Provas -------------------------------------	
	
	private int codigo;
	private Date dia;
	private float nota;
	private Aluno aluno;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Provas -------------------------------------	
	
	public Provas() {
		
	}
	
	public Provas(int codigo) {
		setCodigo(codigo);
	}
	
	public Provas(Date dia) {
		setDia(dia);
	}
	
	public Provas(Aluno aluno) {
		setAluno(aluno);
	}
	
	public Provas(Date dia, float nota, Aluno aluno) {
		
	}
	
	public Provas(int codigo, Date dia, float nota, Aluno aluno) {
		setCodigo(codigo);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Provas -------------------------------------		

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Provas -------------------------------------		

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provas [ Cóodigo = ");
		builder.append(codigo);
		builder.append(" , Dia = ");
		builder.append(dia);
		builder.append(" , Nota = ");
		builder.append(nota);
		builder.append(" ,Aluno = ");
		builder.append(aluno);
		builder.append(" ]");
		return builder.toString();
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////