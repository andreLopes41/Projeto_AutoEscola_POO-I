package com.classes.MainProvas;

import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Provas;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Teste Inserir
		ProvasBO provasBO = new ProvasBO();
		
		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Provas provas = new Provas(dia, 8.9f, aluno);
				if (provasBO.inserir(provas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				provas = new Provas(dia, 6.5f, aluno);
				if (provasBO.inserir(provas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				provas = new Provas(dia, 1.2f, aluno);
				if (provasBO.inserir(provas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}


}
