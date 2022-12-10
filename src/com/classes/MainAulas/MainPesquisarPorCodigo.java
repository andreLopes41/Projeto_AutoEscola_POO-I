package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import com.classes.DTO.*;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR AULA POR CODIGO**
		
		AulasBO aulasBO = new AulasBO();
		
		Aulas aulas = new Aulas(11);
		aulas = aulasBO.procurarPorCodigo(aulas);
				System.out.println(aulas);

	}

}
