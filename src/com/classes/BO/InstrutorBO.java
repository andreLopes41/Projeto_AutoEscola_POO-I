package com.classes.BO;

import java.util.List;

import com.classes.DAO.InstrutorDAO;
import com.classes.DTO.Instrutor;

public class InstrutorBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	
	
	//        **INSERIR**
	
	public boolean inserir(Instrutor instrutor){
        if (existe(instrutor) != true) {
        	InstrutorDAO instrutorDAO = new InstrutorDAO();
            return instrutorDAO.inserir(instrutor);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//        **ALTERAR**
	
    public boolean alterar(Instrutor instrutor){
    	InstrutorDAO instrutorDAO = new InstrutorDAO();
        return instrutorDAO.alterar(instrutor);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //        **EXCLUIR**
    
    public boolean excluir(Instrutor instrutor){
    	InstrutorDAO instrutorDAO = new InstrutorDAO();
        return instrutorDAO.excluir(instrutor);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //      **PROCURAR POR CODIGO**
    
    public Instrutor procurarPorCodigo(Instrutor instrutor){
    	InstrutorDAO instrutorDAO = new InstrutorDAO();
        return instrutorDAO.procurarPorCodigo(instrutor);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **PROCURAR POR CPF**
    
    public Instrutor procurarPorCpf(Instrutor instrutor){
    	InstrutorDAO instrutorDAO = new InstrutorDAO();
        return instrutorDAO.procurarPorCpf(instrutor);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **EXISTE**
    
    public boolean existe(Instrutor instrutor){
    	InstrutorDAO instrutorDAO = new InstrutorDAO();
        return instrutorDAO.existe(instrutor);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//       **PESQUISA POR TODOS**
    
    public List<Instrutor> pesquisarTodos(){
    	InstrutorDAO instrutorDAO = new InstrutorDAO();
        return instrutorDAO.pesquisarTodos();
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////