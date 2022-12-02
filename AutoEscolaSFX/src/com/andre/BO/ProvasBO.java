package com.classes.BO;

import com.classes.DTO.Provas;
import com.classes.DAO.ProvasDAO;
import java.util.List;

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
    public Provas procurarPorCodigo(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.procurarPorCodigo(provas);
    }
    public Provas procurarPorNota(Provas provas){
    	ProvasDAO provasDAO = new ProvasDAO();
        return provasDAO.procurarPorNota(provas);
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
