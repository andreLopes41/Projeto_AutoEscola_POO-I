package com.classes.MainProvas;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR PROVA POR CODIGO**
		
		ProvasBO provasBO = new ProvasBO();
		
		Provas provas = new Provas(2);
		provas = provasBO.procurarPorCodigo(provas);
				System.out.println(provas);

	}

}
