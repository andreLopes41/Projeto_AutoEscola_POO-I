package com.classes.BO;

import com.classes.DTO.Habilitacao;
import com.classes.DAO.HabilitacaoDAO;
import java.util.List;

	public class HabilitacaoBO {
	
	public boolean inserir(Habilitacao habilitacao){
        if (existe(habilitacao) != true) {
        	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
            return habilitacaoDAO.inserir(habilitacao);
        }
        return false;
    }
    public boolean alterar(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.alterar(habilitacao);
    }
    public boolean excluir(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.excluir(habilitacao);
    }
    public Habilitacao procurarPorNumero(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.procurarPorNumero(habilitacao);
    }
    public Habilitacao procurarPorCategoria(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.procurarPorCategoria(habilitacao);
    }
    public boolean existe(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.existe(habilitacao);
    }
    public List<Habilitacao> pesquisarTodos(){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.pesquisarTodos();
    }
	
	

}
