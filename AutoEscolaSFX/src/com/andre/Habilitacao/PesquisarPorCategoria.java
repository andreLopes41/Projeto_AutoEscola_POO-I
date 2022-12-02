package com.classes.Habilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class PesquisarPorCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Categoria
				// retorna o primeiro encontrado
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		Habilitacao habilitacao = new Habilitacao(1, "A");
		habilitacao = habilitacaoBO.procurarPorCategoria(habilitacao);
				System.out.println(habilitacao);

	}

}
