package com.classes.BO;

import java.util.List;

import com.classes.DAO.ProvasDAO;
import com.classes.DTO.Provas;

public class ProvasBO {
	
	public boolean inserir(Provas provas){
        if (existe(provas) != true) {
        	ProvasDAO provasDAO = new ProvasDAO();
            return provasDAO.inserir(provas);
        }
        return false;
    }
    public boolean alterar(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.alterar(provas);
    }
    public boolean excluir(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.excluir(provas);
    }
    public Provas procurarPorData(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.procurarPorData(provas);
    }
    public Provas procurarPorAluno(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.procurarPorAluno(provas);
    }
    public boolean existe(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.existe(provas);
    }
    public List<Provas> pesquisarTodos(){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.pesquisarTodos();
    }

}
