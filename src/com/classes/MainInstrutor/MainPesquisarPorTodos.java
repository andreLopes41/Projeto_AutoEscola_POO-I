package com.classes.MainInstrutor;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.InstrutorBO;
import com.classes.DTO.Instrutor;

public class MainPesquisarPorTodos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR TODAS AS PESSOAS**
		
			InstrutorBO instrutorBO = new InstrutorBO();
				List<Instrutor> lista = new ArrayList<Instrutor>();
				
				lista = instrutorBO.pesquisarTodos();	
				
				for (Instrutor instrutor : lista) {
					System.out.println(instrutor.toString());
				}

	}

}
