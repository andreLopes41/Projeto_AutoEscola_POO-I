package com.classes.MainProvas;

import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Provas;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProvasBO provasBO = new ProvasBO();
		
		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Provas provas = new Provas(dia, 8.9f, aluno);
		if (provasBO.excluir(provas))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
