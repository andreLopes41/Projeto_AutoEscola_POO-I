package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **ALTERAR ALUNO**	
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno(2, "Yuri" ,"087.051.399-41" , "BC");
		
		alunoBO.alterar(aluno);
		aluno = alunoBO.procurarPorCodigo(aluno);
				System.out.println(aluno);

	}

}
