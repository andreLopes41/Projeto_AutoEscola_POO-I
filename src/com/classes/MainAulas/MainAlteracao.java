package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import java.util.Date;
import com.classes.DTO.*;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Alterar o Veiculo	
		AulasBO aulasBO = new AulasBO();
		
		Date dia = new Date();
		Veiculo veiculo = new Veiculo();
		Aluno aluno = new Aluno();
		Instrutor instrutor = new Instrutor();
		
		Aulas aulas = new Aulas(dia, veiculo, aluno, instrutor);
		aulasBO.alterar(aulas);
		aulas = aulasBO.procurarPorData(aulas);
		aulas = aulasBO.procurarPorAluno(aulas);
				System.out.println(aulas);

	}

}
