package com.classes.BO;

import java.util.List;

import com.classes.DAO.AulasDAO;
import com.classes.DTO.Aulas;


public class AulasBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	
	
	//  **INSERIR**
	
	public boolean inserir(Aulas aulas){
        if (existe(aulas) != true) {
        	AulasDAO aulasDAO = new AulasDAO();
            return aulasDAO.inserir(aulas);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//   **ALTERAR**	
	
    public boolean alterar(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.alterar(aulas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //   **EXCLUIR**    
    
    public boolean excluir(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.excluir(aulas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **PROCURAR POR DATA**    
    
    public Aulas procurarPorData(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.procurarPorData(aulas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **PROCURAR POR CODIGO**    
    
    public Aulas procurarPorCodigo(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.procurarPorCodigo(aulas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //    **EXISTE**    
    
    public boolean existe(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.existe(aulas);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //     **PESQUISA POR TODOS**    
    
    public List<Aulas> pesquisarTodos(){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.pesquisarTodos();
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////