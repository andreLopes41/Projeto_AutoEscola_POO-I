package com.classes.MainInstrutor;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainPesquisarPorCpf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR PESSOA POR CPF**
		
		InstrutorBO instrutorBO = new InstrutorBO();
		Instrutor instrutor = new Instrutor("111.051.325-47");
		
		instrutor = instrutorBO.procurarPorCpf(instrutor);
				System.out.println(instrutor);

	}

}
