package com.classes.Veiculo;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		VeiculoBO veiculoBO = new VeiculoBO();
				List<Veiculo> lista = new ArrayList<Veiculo>();
				lista = veiculoBO.pesquisarTodos();	
				for (Veiculo veiculo : lista) {
					System.out.println(veiculo.toString());
				}

	}

}
