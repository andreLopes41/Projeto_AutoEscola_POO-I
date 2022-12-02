package com.classes.Provas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainPesquisaPorCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Codigo
		ProvasBO provasBO = new ProvasBO();
		Provas provas = new Provas(1);
		provas = provasBO.procurarPorCodigo(provas);
		System.out.println(provas);

	}

}
