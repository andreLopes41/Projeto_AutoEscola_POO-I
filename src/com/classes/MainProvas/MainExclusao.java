package com.classes.MainProvas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR PROVA**
		
		ProvasBO provasBO = new ProvasBO();
		
		Provas provas = new Provas(1);
		if (provasBO.excluir(provas))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
