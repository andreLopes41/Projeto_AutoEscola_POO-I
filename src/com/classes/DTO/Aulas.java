package com.classes.DTO;

import java.util.Date;

public class Aulas {
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Aulas -------------------------------------		
	
	private Aulas aulas;
	private int codigoAula;
	private Date dia;
	private int codigoVeiculo;
	private int codigoAluno;
	private int codigoInstrutor;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Aulas -------------------------------------	
	
	public Aulas() {
		
	}
	
	public Aulas(Date dia) {
		setDia(dia);
	}
	
	public Aulas(int codigoAula) {
		setCodigoAula(codigoAula);
	}
	
	public Aulas(int codigoAula, Date dia, int codigoVeiculo, int codigoAluno, int codigoInstrutor) {
		setCodigoAula(codigoAula);
		setDia(dia);
		setCodigoVeiculo(codigoVeiculo);
		setCodigoAluno(codigoAluno);
		setCodigoInstrutor(codigoInstrutor);
		
	}
	
	public Aulas(Date dia, int codigoVeiculo, int codigoAluno, int codigoInstrutor) {
		setDia(dia);
		setCodigoVeiculo(codigoVeiculo);
		setCodigoAluno(codigoAluno);
		setCodigoInstrutor(codigoInstrutor);
		
	}
	
	public Aulas(int codigoAula,int codigoVeiculo, int codigoAluno, int codigoInstrutor) {
		setCodigoAula(codigoAula);
		setCodigoVeiculo(codigoVeiculo);
		setCodigoAluno(codigoAluno);
		setCodigoInstrutor(codigoInstrutor);
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Aulas -------------------------------------		

	public Aulas getAulas() {
		return aulas;
	}

	public void setAulas(Aulas aulas) {
		this.aulas = aulas;
	}

	public int getCodigoAula() {
		return codigoAula;
	}

	public void setCodigoAula(int codigoAula) {
		this.codigoAula = codigoAula;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public int getCodigoVeiculo() {
		return codigoVeiculo;
	}

	public void setCodigoVeiculo(int codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
	}

	public int getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	public int getCodigoInstrutor() {
		return codigoInstrutor;
	}

	public void setCodigoInstrutor(int codigoInstrutor) {
		this.codigoInstrutor = codigoInstrutor;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Aulas -------------------------------------	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ CodigoAula = ");
		builder.append(codigoAula);
		builder.append(", Dia = ");
		builder.append(dia);
		builder.append(", CodigoVeiculo = ");
		builder.append(codigoVeiculo);
		builder.append(", CodigoAluno = ");
		builder.append(codigoAluno);
		builder.append(", CodigoInstrutor = ");
		builder.append(codigoInstrutor);
		builder.append(" ]");
		return builder.toString();
	}
	
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////