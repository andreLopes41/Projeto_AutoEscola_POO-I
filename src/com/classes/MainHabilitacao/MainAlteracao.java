package com.classes.MainHabilitacao;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainAlteracao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **ALTERAR HABILITACAO**	
		
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 18);
		calendario.set(Calendar.MONTH, 9);
		calendario.set(Calendar.YEAR, 2022);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		Habilitacao habilitacao = new Habilitacao(1, sqlDate, 3);
		habilitacaoBO.alterar(habilitacao);
				System.out.println(habilitacao);

	}

}
