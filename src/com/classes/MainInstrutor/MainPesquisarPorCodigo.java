package com.classes.MainInstrutor;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR PESSOA POR CPF**
		
		InstrutorBO instrutorBO = new InstrutorBO();
		Instrutor instrutor = new Instrutor(3);
		
		instrutor = instrutorBO.procurarPorCodigo(instrutor);
				System.out.println(instrutor);

	}

}
