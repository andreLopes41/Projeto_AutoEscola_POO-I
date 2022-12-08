package com.classes.MainHabilitacao;

import java.util.Date;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Habilitacao;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Habilitacao habilitacao = new Habilitacao(aluno, dia);
		if (habilitacaoBO.excluir(habilitacao))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
