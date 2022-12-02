package com.classes.Veiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainInsercao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Inserir
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo("Hyundai HB20");
				if (veiculoBO.inserir(veiculo))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				veiculo = new Veiculo("Mitsubishi Lancer");
				if (veiculoBO.inserir(veiculo))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				veiculo = new Veiculo("Ford Mustang GT");
				if (veiculoBO.inserir(veiculo))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
