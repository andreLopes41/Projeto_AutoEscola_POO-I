package com.classes.BO;

import java.util.List;

import com.classes.DAO.HabilitacaoDAO;
import com.classes.DTO.Habilitacao;

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
    public Habilitacao procurarPorData(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.procurarPorData(habilitacao);
    }
    public Habilitacao procurarPorAluno(Habilitacao habilitacao){
    	HabilitacaoDAO habilitacaoDAO = new HabilitacaoDAO();
        return habilitacaoDAO.procurarPorAluno(habilitacao);
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
