package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR ALUNO**
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno(2);
		
		if (alunoBO.excluir(aluno))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
