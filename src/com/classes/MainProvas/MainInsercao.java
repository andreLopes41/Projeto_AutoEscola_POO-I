package com.classes.MainProvas;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UMA NOVA PROVA** 
		
		ProvasBO provasBO = new ProvasBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 14);
		calendario.set(Calendar.MONTH, 04);
		calendario.set(Calendar.YEAR, 2027);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		
		Provas provas = new Provas(sqlDate, 5 , 8.9f);
				if (provasBO.inserir(provas))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}


}
