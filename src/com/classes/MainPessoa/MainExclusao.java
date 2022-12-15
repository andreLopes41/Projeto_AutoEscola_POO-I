package com.classes.MainPessoa;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExclusao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **EXCLUIR PESSOA**
		
		PessoaBO peesoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(2);
		
		if (peesoaBO.excluir(pessoa))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}

}
