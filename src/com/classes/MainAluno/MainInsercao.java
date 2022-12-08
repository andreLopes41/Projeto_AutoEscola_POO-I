package com.classes.MainAluno;

import com.classes.BO.AlunoBO;
import com.classes.DTO.Aluno;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UM NOVO ALUNO**	
		
		AlunoBO alunoBO = new AlunoBO();
		Aluno aluno = new Aluno("Andre" ,"000.051.399-41" , "AB");
		
				if (alunoBO.inserir(aluno))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				aluno = new Aluno("Luis", "288.171.321-11" , "A");
				
				if (alunoBO.inserir(aluno))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				aluno = new Aluno("Murilo" , "210.888.861-09" , "ABCD");
				
				if (alunoBO.inserir(aluno))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
