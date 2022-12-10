package com.classes.BO;

import java.util.List;

import com.classes.DAO.ProvasDAO;
import com.classes.DTO.Provas;

public class ProvasBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	

	//  **INSERIR**	
	
	public boolean inserir(Provas provas){
        if (existe(provas) != true) {
        	ProvasDAO provasDAO = new ProvasDAO();
            return provasDAO.inserir(provas);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//   **ALTERAR**	
	
    public boolean alterar(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.alterar(provas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //   **EXCLUIR**     
    
    public boolean excluir(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.excluir(provas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **PROCURAR POR DATA**     
    
    public Provas procurarPorData(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.procurarPorData(provas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **PROCURAR POR CODIGO**     
    
    public Provas procurarPorCodigo(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.procurarPorCodigo(provas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **EXISTE**      
    
    public boolean existe(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.existe(provas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //     **PESQUISA POR TODOS**
    
    public List<Provas> pesquisarTodos(){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.pesquisarTodos();
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////