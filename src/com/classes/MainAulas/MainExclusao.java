package com.classes.MainAulas;

import com.classes.BO.AulasBO;

import java.util.Date;
import com.classes.DTO.*;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AulasBO aulasBO = new AulasBO();
		
		Date dia = new Date();
		Veiculo veiculo = new Veiculo();
		Aluno aluno = new Aluno();
		Instrutor instrutor = new Instrutor();
		
		Aulas aulas = new Aulas(dia, veiculo, aluno, instrutor);
		if (aulasBO.excluir(aulas))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
