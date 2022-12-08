package com.classes.MainProvas;

import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Aluno;
import com.classes.DTO.Provas;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Alterar o Veiculo	
		ProvasBO provasBO = new ProvasBO();
		
		Date dia = new Date();
		Aluno aluno = new Aluno();
		
		Provas provas = new Provas(dia, 8.9f, aluno);
		provasBO.alterar(provas);
		provas = provasBO.procurarPorData(provas);
		provas = provasBO.procurarPorAluno(provas);
				System.out.println(provas);

	}

}
