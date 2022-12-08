package com.classes.BO;

import com.classes.DTO.Pessoa;
import com.classes.DAO.PessoaDAO;
import java.util.List;

public class PessoaBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	
	
	//        **INSERIR**
	
	public boolean inserir(Pessoa pessoa){
        if (existe(pessoa) != true) {
        	PessoaDAO pessoaDAO = new PessoaDAO();
            return pessoaDAO.inserir(pessoa);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//        **ALTERAR**
	
    public boolean alterar(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.alterar(pessoa);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //        **EXCLUIR**
    
    public boolean excluir(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.excluir(pessoa);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//       **PROCURAR POR CODIGO**

    public Pessoa procurarPorCodigo(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
    	return pessoaDAO.procurarPorCodigo(pessoa);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **PROCURAR POR CPF**
    
    public Pessoa procurarPorCpf(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.procurarPorCpf(pessoa);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **EXISTE**
    
    public boolean existe(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.existe(pessoa);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **PESQUISA POR TODOS**
    
    public List<Pessoa> pesquisarTodos(){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.pesquisarTodos();
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////