package com.classes.Veiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisarPorCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Procurar por Codigo
				VeiculoBO veiculoBO = new VeiculoBO();
				Veiculo veiculo = new Veiculo(1,"");
				veiculo = veiculoBO.procurarPorCodigo(veiculo);
				System.out.println(veiculo);

	}

}
