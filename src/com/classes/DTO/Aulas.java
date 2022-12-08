package com.classes.DTO;

import java.util.Date;

public class Aulas {
	
	private int codigo;
	private Date dia;
	private Veiculo veiculo;
	private Aluno aluno;
	private Instrutor instrutor;
	
	public Aulas() {
		
	}
	
	public Aulas(int codigo) {
		setCodigo(codigo);
	}
	
	public Aulas(Aluno aluno) {
		setAluno(aluno);
	}
	
	public Aulas(Date dia) {
		setDia(dia);
	}
	
	public Aulas(Date dia, Veiculo veiculo, Aluno aluno, Instrutor instrutor) {
		setDia(dia);
		setVeiculo(veiculo);
		setAluno(aluno);
		setInstrutor(instrutor);
	}
	
	public Aulas(Veiculo veiculo, Aluno aluno, Instrutor instrutor) {
		setVeiculo(veiculo);
		setAluno(aluno);
		setInstrutor(instrutor);
	}
	
	public Aulas(int codigo, Date dia, Veiculo veiculo, Aluno aluno, Instrutor instrutor) {
		setCodigo(codigo);
		setDia(dia);
		setVeiculo(veiculo);
		setAluno(aluno);
		setInstrutor(instrutor);
	}

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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aulas [ Código = ");
		builder.append(codigo);
		builder.append(" , Dia = ");
		builder.append(dia);
		builder.append(" , Veiculo = ");
		builder.append(veiculo);
		builder.append(" , Aluno = ");
		builder.append(aluno);
		builder.append(" , Instrutor = ");
		builder.append(instrutor);
		builder.append(" ]");
		return builder.toString();
	}
}
