package com.classes.MainAulas;

import java.util.Date;
import java.util.Calendar;

import com.classes.BO.AulasBO;
import com.classes.DTO.*;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UMA NOVA AULA** 
		
			AulasBO aulasBO = new AulasBO();
			
			Calendar calendario = Calendar.getInstance();
    		
    		calendario.set(Calendar.DAY_OF_MONTH, 26);
    		calendario.set(Calendar.MONTH, 11);
    		calendario.set(Calendar.YEAR, 2024);
    		
    		Date dt = calendario.getTime();
    		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
			Aulas aulas = new Aulas(sqlDate, 3, 1, 3);
		
				if (aulasBO.inserir(aulas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
