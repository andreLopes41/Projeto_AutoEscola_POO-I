package com.classes.MainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainExclusao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR VEICULO**
		
		VeiculoBO veiculoBO = new VeiculoBO();
		Veiculo veiculo = new Veiculo(2);
		
		if (veiculoBO.excluir(veiculo))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}