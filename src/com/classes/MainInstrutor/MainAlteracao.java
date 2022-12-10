package com.classes.MainInstrutor;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **ALTERAR INSTRUTOR** 
		
		InstrutorBO instrutorBO = new InstrutorBO();
		Instrutor instrutor = new Instrutor("Mamaco" ,"111.051.325-47");
		
		instrutorBO.alterar(instrutor);
		instrutor = instrutorBO.procurarPorCodigo(instrutor);
				System.out.println(instrutor);

	}

}
