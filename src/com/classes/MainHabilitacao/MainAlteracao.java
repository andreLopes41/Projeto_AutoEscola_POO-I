package com.classes.MainHabilitacao;

import java.util.Date;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Habilitacao;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Alterar o Veiculo	
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Habilitacao habilitacao = new Habilitacao(aluno, dia);
		habilitacaoBO.alterar(habilitacao);
		habilitacao = habilitacaoBO.procurarPorData(habilitacao);
		habilitacao = habilitacaoBO.procurarPorAluno(habilitacao);
				System.out.println(habilitacao);

	}

}
