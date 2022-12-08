package com.classes.DTO;

import java.util.Date;

public class Habilitacao {
	
	private Aluno aluno;
	private Date dataEmissao;
	
	public Habilitacao() {
		
	}
	
	public Habilitacao(Aluno aluno) {
		setAluno(aluno);
	}
	
	public Habilitacao(Aluno aluno, Date dataEmissao) {
		setAluno(aluno);
		setDataEmissao(dataEmissao);
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Habilitacao [aluno=");
		builder.append(aluno);
		builder.append(", dataEmissao=");
		builder.append(dataEmissao);
		builder.append("]");
		return builder.toString();
	}
	
	

}
