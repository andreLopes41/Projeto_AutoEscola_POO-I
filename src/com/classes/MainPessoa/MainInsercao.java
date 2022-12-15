package com.classes.MainPessoa;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainInsercao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//      **INSERE UMA NOVA PESSOA**		
		
				PessoaBO peesoaBO = new PessoaBO();
				Pessoa pessoa = new Pessoa("Matheus" ,"222.000.111-44");
				
				if (peesoaBO.inserir(pessoa))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				pessoa = new Pessoa("Lucas", "000.111.222-33");
				
				if (peesoaBO.inserir(pessoa))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				pessoa = new Pessoa("Gian" , "777.000.000-99");
				
				if (peesoaBO.inserir(pessoa))
					System.out.println("Inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");

	}

}
