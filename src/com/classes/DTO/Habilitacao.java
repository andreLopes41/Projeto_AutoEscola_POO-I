package com.classes.DTO;

import java.util.Date;

public class Habilitacao {
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Atributos da Classe Habilitacao -------------------------------------		
	
	private int codigoHabilitacao;
	private int codigoAluno;
	private Date dataEmissao;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Construores da Classe Habilitacao -------------------------------------		
	
	public Habilitacao() {
		
	}
	
	public Habilitacao(int codigoHabilitacao) {
		setCodigoHabilitacao(codigoHabilitacao);
	}
	
	public Habilitacao(Date dataEmissao) {
		setDataEmissao(dataEmissao);
	}
	
	public Habilitacao(Date dataEmissao, int codigoAluno) {
		setDataEmissao(dataEmissao);
		setCodigoAluno(codigoAluno);
	}
	
	public Habilitacao(int codigoHabilitacao, Date dataEmissao, int codigoAluno) {
		setCodigoHabilitacao(codigoHabilitacao);
		setDataEmissao(dataEmissao);
		setCodigoAluno(codigoAluno);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Getters and Setters da Classe Habilitacao -------------------------------------	

	public int getCodigoHabilitacao() {
		return codigoHabilitacao;
	}

	public void setCodigoHabilitacao(int codigoHabilitacao) {
		this.codigoHabilitacao = codigoHabilitacao;
	}

	public int getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Monta a Classe Habilitacao -------------------------------------	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Habilitacao [ CódigoHabilitacao = ");
		builder.append(codigoHabilitacao);
		builder.append(" , dataEmissao = ");
		builder.append(dataEmissao);
		builder.append(" , codigoAluno = ");
		builder.append(codigoAluno);
		builder.append(" ]");
		return builder.toString();
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
