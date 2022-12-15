package com.classes.MainAulas;

import com.classes.BO.AulasBO;
import com.classes.DTO.Aulas;

import java.util.Calendar;
import java.util.Date;

public class MainPesquisarPorData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR AULA POR DATA**
		
		AulasBO aulasBO = new AulasBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 26);
		calendario.set(Calendar.MONTH, 11);
		calendario.set(Calendar.YEAR, 2024);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		Aulas aulas = new Aulas(sqlDate);
		aulas = aulasBO.procurarPorData(aulas);
				System.out.println(aulas);

	}

}
