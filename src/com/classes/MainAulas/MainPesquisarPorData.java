package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import com.classes.DTO.Aulas;
import java.util.Date;

public class MainPesquisarPorData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Dia
		AulasBO aulasBO = new AulasBO();
		Date dia = new Date();
		
		Aulas aulas = new Aulas(dia);
		aulas = aulasBO.procurarPorData(aulas);
				System.out.println(aulas);

	}

}
