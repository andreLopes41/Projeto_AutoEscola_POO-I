package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import com.classes.DTO.*;

public class MainPesquisarPorAluno {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por CPF
		AulasBO aulasBO = new AulasBO();
		Aluno aluno = new Aluno();
		
		Aulas aulas = new Aulas(aluno);
		aulas = aulasBO.procurarPorAluno(aulas);
				System.out.println(aulas);

	}

}
