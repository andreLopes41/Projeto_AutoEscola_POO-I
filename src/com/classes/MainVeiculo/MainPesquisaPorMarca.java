package com.classes.MainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisaPorMarca {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      **PROCURAR VEICULO POR MARCA E MODELO**
		
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo("Hyundai HB20");
				
				veiculo = veiculoBO.procurarPorMarca(veiculo);
				System.out.println(veiculo);

	}

}
