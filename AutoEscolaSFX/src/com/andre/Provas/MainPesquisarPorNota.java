package com.classes.Provas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainPesquisarPorNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Nota
		// retorna o primeiro encontrado
		ProvasBO provasBO = new ProvasBO();
		Provas provas = new Provas(1,7.9f);
		provas = provasBO.procurarPorNota(provas);
		System.out.println(provas);

	}

}
