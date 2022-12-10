package com.classes.DTO;

import java.util.Date;

public class Provas {
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Provas -------------------------------------	
	
	private int codigoProva;
	private Date dia;
	private float nota;
	private int codigoAluno;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Provas -------------------------------------	
	
	public Provas() {
		
	}
	
	public Provas(int codigoProva) {
		setCodigoProva(codigoProva);
	}
	
	public Provas(Date dia) {
		setDia(dia);
	}
	
	public Provas(Date dia, int codigoAluno, float nota) {
		setDia(dia);
		setCodigoAluno(codigoAluno);
		setNota(nota);
	}
	
	
	
	public Provas(int codigoProva,  Date dia, int codigoAluno, float nota) {
		setCodigoProva(codigoProva);
		setDia(dia);
		setCodigoAluno(codigoAluno);
		setNota(nota);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Provas -------------------------------------		

	public int getCodigoProva() {
		return codigoProva;
	}

	public void setCodigoProva(int codigoProva) {
		this.codigoProva = codigoProva;
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

	public int getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Provas -------------------------------------		

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provas [ Cóodigo = ");
		builder.append(codigoProva);
		builder.append(" , Dia = ");
		builder.append(dia);
		builder.append(" ,Aluno = ");
		builder.append(codigoAluno);
		builder.append(" , Nota = ");
		builder.append(nota);
		builder.append(" ]");
		return builder.toString();
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////