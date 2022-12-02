package com.classes.Veiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainProcurarPorMarca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Marca
				// retorna o primeiro encontrado
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo("Ford Mustang GT");
				veiculo = veiculoBO.procurarPorMarca(veiculo);
				System.out.println(veiculo);

	}

}
