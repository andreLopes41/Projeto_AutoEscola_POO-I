package com.classes.Habilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainAlteracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Alterar	
				HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
				Habilitacao habilitacao = new Habilitacao(1, "AB");
				habilitacaoBO.alterar(habilitacao);
				habilitacao = habilitacaoBO.procurarPorNumero(habilitacao);
				System.out.println(habilitacao);

	}

}
