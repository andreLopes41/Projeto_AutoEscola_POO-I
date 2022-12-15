package com.classes.MainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainAlteracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **ALTERAR VEICULO** 	
		
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo(3, "Moto" ,"Mortis Trinks");
				
				veiculoBO.alterar(veiculo);
				veiculo = veiculoBO.procurarPorCodigo(veiculo);
				System.out.println(veiculo);

	}

}