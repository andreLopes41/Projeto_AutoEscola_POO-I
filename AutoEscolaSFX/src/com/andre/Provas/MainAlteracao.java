package com.classes.Provas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainAlteracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Alterar	
		ProvasBO provasBO = new ProvasBO();
		Provas provas = new Provas(1,7.9f);
		provasBO.alterar(provas);
		provas = provasBO.procurarPorCodigo(provas);
		System.out.println(provas);

	}

}
