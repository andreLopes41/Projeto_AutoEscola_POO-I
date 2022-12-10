package com.classes.MainPessoa;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainPesquisarPorTodos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR TODAS AS PESSOAS**
		
			PessoaBO peesoaBO = new PessoaBO();
				List<Pessoa> lista = new ArrayList<Pessoa>();
				
				lista = peesoaBO.pesquisarTodos();
				
				for (Pessoa pessoa : lista) {
					System.out.println(pessoa.toString());
				}

	}

}
