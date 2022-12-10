package com.classes.MainHabilitacao;

import java.util.Calendar;
import java.util.Date;

import com.classes.BO.HabilitacaoBO;
import com.classes.DTO.Habilitacao;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//      **INSERE UMA NOVA HABILITACAO** 
		
		HabilitacaoBO habilitacaoBO = new HabilitacaoBO();
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 06);
		calendario.set(Calendar.MONTH, 11);
		calendario.set(Calendar.YEAR, 2021);
		
		Date dt = calendario.getTime();
		java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
		
		
		Habilitacao habilitacao = new Habilitacao(sqlDate, 5);
				if (habilitacaoBO.inserir(habilitacao))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				

	}

}
