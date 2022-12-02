package com.classes.Habilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class PesquisarPorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Codigo
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
				Habilitacao habilitacao = new Habilitacao(1);
				habilitacao = habilitacaoBO.procurarPorNumero(habilitacao);
				System.out.println(habilitacao);

	}

}
