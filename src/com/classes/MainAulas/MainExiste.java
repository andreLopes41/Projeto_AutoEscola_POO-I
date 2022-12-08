package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import java.util.Date;
import com.classes.DTO.*;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Existe
				// Verifica se existe outro item com a mesma descricao
			AulasBO aulasBO = new AulasBO();
		
			Date dia = new Date();
			Veiculo veiculo = new Veiculo();
			Aluno aluno = new Aluno();
			Instrutor instrutor = new Instrutor();
		
			Aulas aulas = new Aulas(dia, veiculo, aluno, instrutor);
				if (aulasBO.existe(aulas))
					System.out.println("Aula Encontrada");
				else
					System.out.println("Nao Encontrada");

	}
		


}
