package com.classes.BO;

import java.util.List;

import com.classes.DAO.AulasDAO;
import com.classes.DTO.Aulas;

public class AulasBO {
	
	public boolean inserir(Aulas aulas){
        if (existe(aulas) != true) {
        	AulasDAO aulasDAO = new AulasDAO();
            return aulasDAO.inserir(aulas);
        }
        return false;
    }
    public boolean alterar(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.alterar(aulas);
    }
    public boolean excluir(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.excluir(aulas);
    }
    public Aulas procurarPorData(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.procurarPorData(aulas);
    }
    public Aulas procurarPorAluno(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.procurarPorAluno(aulas);
    }
    public boolean existe(Aulas aulas){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.existe(aulas);
    }
    public List<Aulas> pesquisarTodos(){
    	AulasDAO aulasDAO = new AulasDAO();
        return aulasDAO.pesquisarTodos();
    }

}
