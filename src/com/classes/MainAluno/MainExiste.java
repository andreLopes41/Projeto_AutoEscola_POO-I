package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      **VERIFICA SE EXISTE O ALUNO**
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno("Yuri" ,"087.051.399-41" , "AB");
		
				if (alunoBO.existe(aluno))
					System.out.println("Aluno Encontrado");
				else
					System.out.println("Não Encontrado");

	}

}
