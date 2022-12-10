package com.classes.MainAluno;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainPesquisarPorTodos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR TODOS OS ALUNOS**
		
		AlunoBO alunoBO = new AlunoBO();
				List<Aluno> lista = new ArrayList<Aluno>();
				
				lista = alunoBO.pesquisarTodos();
				
				for (Aluno aluno : lista) {
					System.out.println(aluno.toString());
				}

	}

}
