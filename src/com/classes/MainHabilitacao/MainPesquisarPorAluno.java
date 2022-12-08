package com.classes.MainHabilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Habilitacao;

public class MainPesquisarPorAluno {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por CPF
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Aluno aluno = new Aluno();
		
		Habilitacao habilitacao = new Habilitacao(aluno);
		habilitacao = habilitacaoBO.procurarPorAluno(habilitacao);
				System.out.println(habilitacao);

	}

}
