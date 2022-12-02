package com.classes.Provas;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Pesquisar Todos (Retorna a Lista de Provas)
			ProvasBO provasBO = new ProvasBO();
						List<Provas> lista = new ArrayList<Provas>();
						lista = provasBO.pesquisarTodos();	
						for (Provas provas : lista) {
							System.out.println(provas.toString());
						}

	}

}
