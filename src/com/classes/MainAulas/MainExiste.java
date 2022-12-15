package com.classes.MainAulas;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.AulasBO;
import com.classes.DTO.*;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **VERIFICA SE EXISTE A AULA**
		
			AulasBO aulasBO = new AulasBO();
			
			Calendar calendario = Calendar.getInstance();
			
			calendario.set(Calendar.DAY_OF_MONTH, 26);
    		calendario.set(Calendar.MONTH, 11);
    		calendario.set(Calendar.YEAR, 2024);
			
			Date dt = calendario.getTime();
			java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
			Aulas aulas = new Aulas(1, sqlDate, 3, 1, 3);
				if (aulasBO.existe(aulas))
					System.out.println("Aula Encontrada");
				else
					System.out.println("Nao Encontrada");

	}
		


}
