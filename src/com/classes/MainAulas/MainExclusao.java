package com.classes.MainAulas;

import com.classes.BO.AulasBO;

import com.classes.DTO.*;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR AULA**
		
		AulasBO aulasBO = new AulasBO();
		
		Aulas aulas = new Aulas(5);
		if (aulasBO.excluir(aulas))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
