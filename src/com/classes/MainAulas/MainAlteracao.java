package com.classes.MainAulas;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.AulasBO;
import com.classes.DTO.*;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **ALTERAR AULA** 
		
		AulasBO aulasBO = new AulasBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 15);
		calendario.set(Calendar.MONTH, 9);
		calendario.set(Calendar.YEAR, 1987);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());

		Aulas aulas = new Aulas(1, sqlDate, 1, 3, 1);	
		aulasBO.alterar(aulas);
				System.out.println(aulas);

	}

}
