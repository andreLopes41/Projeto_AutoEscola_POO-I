package com.classes.MainPessoa;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;


public class MainPesquisarPorCpf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **PROCURAR PESSOA POR CPF**
		
			PessoaBO peesoaBO = new PessoaBO();
			Pessoa pessoa = new Pessoa("888.171.229-33");
			
			pessoa = peesoaBO.procurarPorCpf(pessoa);
				System.out.println(pessoa);

	}

}
