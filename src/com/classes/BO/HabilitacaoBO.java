package com.classes.BO;

import java.util.List;

import com.classes.DAO.HabilitacaoDAO;
import com.classes.DTO.Habilitacao;

public class HabilitacaoBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	

	//  **INSERIR**		
	
	public boolean inserir(Habilitacao habilitacao){
        if (existe(habilitacao) != true) {
        	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
            return habilitacaoDAO.inserir(habilitacao);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//   **ALTERAR**		
	
    public boolean alterar(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.alterar(habilitacao);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //   **EXCLUIR**   
    
    public boolean excluir(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.excluir(habilitacao);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **PROCURAR POR DATA**      
    
    public Habilitacao procurarPorData(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.procurarPorData(habilitacao);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **PROCURAR POR CODIGO**      
    
    public Habilitacao procurarPorCodigo(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.procurarPorCodigo(habilitacao);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **EXISTE**    
    
    public boolean existe(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.existe(habilitacao);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //     **PESQUISA POR TODOS**
    
    public List<Habilitacao> pesquisarTodos(){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.pesquisarTodos();
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////