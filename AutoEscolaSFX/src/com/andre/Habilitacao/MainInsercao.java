package com.classes.Habilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainInsercao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Inserir
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		Habilitacao habilitacao = new Habilitacao("AB");
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				habilitacao = new Habilitacao("BC");
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				habilitacao = new Habilitacao("A");
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
