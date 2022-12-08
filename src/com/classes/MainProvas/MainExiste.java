package com.classes.MainProvas;

import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Provas;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Existe
				// Verifica se existe outro item com a mesma descricao
		ProvasBO provasBO = new ProvasBO();

		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Provas provas = new Provas(dia, 8.9f, aluno);
				if (provasBO.existe(provas))
					System.out.println("Prova Encontrada");
				else
					System.out.println("Nao Encontrada");

	}

}
