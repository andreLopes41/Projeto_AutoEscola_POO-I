package com.classes.MainProvas;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.ProvasBO;
import com.classes.DTO.Provas;

public class MainPesquisarPorData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR PROVA POR DATA**		
		
		ProvasBO provasBO = new ProvasBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 14);
		calendario.set(Calendar.MONTH, 04);
		calendario.set(Calendar.YEAR, 2027);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		Provas provas = new Provas(sqlDate);
		provas = provasBO.procurarPorData(provas);
				System.out.println(provas);

	}

}
