package com.classes.Veiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainAlteracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Alterar	
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo(1,"Fiat Mobi");
				veiculoBO.alterar(veiculo);
				veiculo = veiculoBO.procurarPorCodigo(veiculo);
				System.out.println(veiculo);

	}

}
