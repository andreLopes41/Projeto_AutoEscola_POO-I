package com.classes.MainPessoa;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainPesquisarPorCodigo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR PESSOA POR CODIGO**
		
			PessoaBO peesoaBO = new PessoaBO();
			Pessoa pessoa = new Pessoa(1);
			
			pessoa = peesoaBO.procurarPorCodigo(pessoa);
				System.out.println(pessoa);

	}

}
