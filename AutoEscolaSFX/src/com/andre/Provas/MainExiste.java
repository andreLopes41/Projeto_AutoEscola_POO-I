package com.classes.Provas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainExiste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		ProvasBO provasBO = new ProvasBO();
		Provas provas = new Provas(7.9f);
		if (provasBO.existe(provas))
			System.out.println("Prova Encontrada");
		else
			System.out.println("Nao Encontrada");

	}

}
