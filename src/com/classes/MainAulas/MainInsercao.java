package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import java.util.Date;
import com.classes.DTO.*;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Teste Inserir
			AulasBO aulasBO = new AulasBO();
		
			Date dia = new Date();
			Veiculo veiculo = new Veiculo();
			Aluno aluno = new Aluno();
			Instrutor instrutor = new Instrutor();
		
			Aulas aulas = new Aulas(veiculo, aluno, instrutor);
				if (aulasBO.inserir(aulas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				aulas = new Aulas(veiculo, aluno, instrutor);
				if (aulasBO.inserir(aulas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				aulas = new Aulas(veiculo, aluno, instrutor);
				if (aulasBO.inserir(aulas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
