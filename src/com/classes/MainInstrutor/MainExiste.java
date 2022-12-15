package com.classes.MainInstrutor;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **VERIFICA SE EXISTE O INSTRUTOR**
		
			InstrutorBO instrutorBO = new InstrutorBO();
			Instrutor instrutor = new Instrutor("Mamaco" ,"111.051.325-47");
			
				if (instrutorBO.existe(instrutor))
					System.out.println("Instrutor Encontrado");
				else
					System.out.println("Não Encontrado");

	}

}
