package com.classes.MainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      **PROCURAR VEICULO POR CODIGO**
		
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo(2);
				
				veiculo = veiculoBO.procurarPorCodigo(veiculo);
				System.out.println(veiculo);

	}

}
