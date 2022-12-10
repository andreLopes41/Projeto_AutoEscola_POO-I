package com.classes.MainPessoa;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//      **VERIFICA SE EXISTE A PESSOA**
		
				PessoaBO peesoaBO = new PessoaBO();
				Pessoa pessoa = new Pessoa("Matheus" ,"222.000.111-44");
				
				if (peesoaBO.existe(pessoa))
					System.out.println("Pessoa Encontrada");
				else
					System.out.println("**Não Encontrada**");

	}

}
