package com.classes.Veiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainExiste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Existe
				// Verifica se existe outro item com a mesma descricao
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo("LG");
				if (veiculoBO.existe(veiculo))
					System.out.println("Veiculo Encontrada");
				else
					System.out.println("Nao Encontrada");

	}

}
