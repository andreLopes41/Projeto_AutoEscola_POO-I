package com.classes.MainHabilitacao;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainPesquisarPorTodos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
				List<Habilitacao> lista = new ArrayList<Habilitacao>();
				lista = habilitacaoBO.pesquisarTodos();	
				for (Habilitacao habilitacao : lista) {
					System.out.println(habilitacao.toString());
				}

	}

}
