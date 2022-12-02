package com.classes.Habilitacao;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class PesquisarPorTodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Pesquisar Todos (Retorna a Lista de Habilitacoes)
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
								List<Habilitacao> lista = new ArrayList<Habilitacao>();
								lista = habilitacaoBO.pesquisarTodos();	
								for (Habilitacao provas : lista) {
									System.out.println(provas.toString());
								}

	}

}
