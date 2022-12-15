package com.classes.MainHabilitacao;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **VERIFICA SE EXISTE A HABILITACAO**
		
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 06);
		calendario.set(Calendar.MONTH, 11);
		calendario.set(Calendar.YEAR, 2021);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		Habilitacao habilitacao = new Habilitacao(sqlDate, 1);
		if (habilitacaoBO.excluir(habilitacao))
			System.out.println("Habilitação Encontrada");
		else
			System.out.println("Não Encontrada");

	}

}
