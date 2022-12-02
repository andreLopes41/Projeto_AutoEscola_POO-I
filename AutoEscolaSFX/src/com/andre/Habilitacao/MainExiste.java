package com.classes.Habilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainExiste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Existe
				// Verifica se existe outro item com o Meesmo numero
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		Habilitacao habilitacao = new Habilitacao("AB");
				if (habilitacaoBO.existe(habilitacao))
					System.out.println("Prova Encontrada");
				else
					System.out.println("Nao Encontrada");

	}

}
