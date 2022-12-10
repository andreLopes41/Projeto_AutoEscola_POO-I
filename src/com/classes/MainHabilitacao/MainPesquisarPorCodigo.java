package com.classes.MainHabilitacao;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR HABILITACAO POR CODIGO**
		
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Habilitacao habilitacao = new Habilitacao(2);
		habilitacao = habilitacaoBO.procurarPorCodigo(habilitacao);
				System.out.println(habilitacao);

	}

}
