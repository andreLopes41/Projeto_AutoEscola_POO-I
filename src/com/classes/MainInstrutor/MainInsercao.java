package com.classes.MainInstrutor;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UMA NOVO INSTRUTOR**
		
			InstrutorBO instrutorBO = new InstrutorBO();
			Instrutor instrutor = new Instrutor("Peterson" , "666.051.325-47");
			
				if (instrutorBO.inserir(instrutor))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				instrutor = new Instrutor("Douglas", "256.987.123-39");
				
				if (instrutorBO.inserir(instrutor))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				instrutor = new Instrutor("Reginaldo" , "410.258.963-00");
				
				if (instrutorBO.inserir(instrutor))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
