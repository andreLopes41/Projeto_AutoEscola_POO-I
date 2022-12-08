package com.classes.MainProvas;

import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainPesquisarPorData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Dia
		ProvasBO provasBO = new ProvasBO();
		Date dia = new Date();
		
		Provas provas = new Provas(dia);
		provas = provasBO.procurarPorData(provas);
				System.out.println(provas);

	}

}
