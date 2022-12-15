package com.classes.MainInstrutor;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR INSTRUTOR**
		
		InstrutorBO instrutorBO = new InstrutorBO();
		Instrutor instrutor = new Instrutor(2);
		
		if (instrutorBO.excluir(instrutor))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
