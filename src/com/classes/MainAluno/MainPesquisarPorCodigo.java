package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR ALUNO POR CODIGO**
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno(3);
		
		aluno = alunoBO.procurarPorCodigo(aluno);
				System.out.println(aluno);

	}

}
