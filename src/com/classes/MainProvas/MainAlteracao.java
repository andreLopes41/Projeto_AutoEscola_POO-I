package com.classes.MainProvas;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **ALTERAR PROVA** 
		
		ProvasBO provasBO = new ProvasBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 7);
		calendario.set(Calendar.MONTH, 01);
		calendario.set(Calendar.YEAR, 2024);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		Provas provas = new Provas(1, sqlDate,  1, 7.9f);
		provasBO.alterar(provas);
				System.out.println(provas);

	}

}
