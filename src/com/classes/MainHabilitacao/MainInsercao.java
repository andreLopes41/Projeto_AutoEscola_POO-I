package com.classes.MainHabilitacao;

import java.util.Date;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Habilitacao;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Teste Inserir
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Habilitacao habilitacao = new Habilitacao(aluno, dia);
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				habilitacao = new Habilitacao(aluno, dia);
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				habilitacao = new Habilitacao(aluno, dia);
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
