package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainPesquisarPorCpf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR ALUNO POR CPF**
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno("087.051.399-41");
		
		aluno = alunoBO.procurarPorCpf(aluno);
				System.out.println(aluno);

	}

}
