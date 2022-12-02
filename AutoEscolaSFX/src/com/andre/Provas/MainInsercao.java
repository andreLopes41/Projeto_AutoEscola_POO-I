package com.classes.Provas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainInsercao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Inserir
		ProvasBO provasBO = new ProvasBO();
		Provas provas = new Provas(7.9f);
		if (provasBO.inserir(provas))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
			provas = new Provas(8.5f);
		if (provasBO.inserir(provas))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		provas = new Provas(2.4f);
		if (provasBO.inserir(provas))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");

	}

}
