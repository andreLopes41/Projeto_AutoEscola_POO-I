package com.classes.MainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainInsercao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UM NOVO VEICULO**	
		
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo("Carro" , "Hyundai HB20");
				
				if (veiculoBO.inserir(veiculo))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				veiculo = new Veiculo("Moto", "Yamaha xj6");
				
				if (veiculoBO.inserir(veiculo))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				veiculo = new Veiculo("Carro" , "Honda Civic Type-r");
				
				if (veiculoBO.inserir(veiculo))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}