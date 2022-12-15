package com.classes.MainPessoa;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainAlteracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//           **ALTERAR PESSOA** 
		
		PessoaBO peesoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(3, "Joao", "888.171.229-33");
		
		peesoaBO.alterar(pessoa);
		pessoa = peesoaBO.procurarPorCodigo(pessoa);
				System.out.println(pessoa);

	}

}