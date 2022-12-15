package com.classes.MainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainExiste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **VERIFICA SE EXISTE O VEICULO**
		
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo("Carro" , "Hyundai HB20");
				
				if (veiculoBO.existe(veiculo))
					System.out.println("Veiculo Encontrado");
				else
					System.out.println("Não Encontrado");

	}

}
