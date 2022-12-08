package com.classes.MainAulas;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.AulasBO;
import com.classes.DTO.*;

public class MainPesquisarPorTodos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
			AulasBO aulasBO = new AulasBO();
				List<Aulas> lista = new ArrayList<Aulas>();
				lista = aulasBO.pesquisarTodos();	
				for (Aulas aulas : lista) {
					System.out.println(aulas.toString());
				}

	}

}
