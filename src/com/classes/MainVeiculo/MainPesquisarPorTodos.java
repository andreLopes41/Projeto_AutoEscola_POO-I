package com.classes.MainVeiculo;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisarPorTodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR TODOS OS VEICULOS**
		
		VeiculoBO veiculoBO = new VeiculoBO();
				List<Veiculo> lista = new ArrayList<Veiculo>();
				
				lista = veiculoBO.pesquisarTodos();	
				
				for (Veiculo veiculo : lista) {
					System.out.println(veiculo.toString());
				}

	}

}
