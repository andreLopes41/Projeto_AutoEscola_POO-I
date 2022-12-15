package com.classes.BO;

import java.util.List;

import com.classes.DAO.AlunoDAO;
import com.classes.DTO.Aluno;

public class AlunoBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	

	//        **INSERIR**	
	
	public boolean inserir(Aluno aluno){
        if (existe(aluno) != true) {
        	AlunoDAO alunoDAO = new AlunoDAO();
            return alunoDAO.inserir(aluno);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//        **ALTERAR**
	
    public boolean alterar(Aluno aluno){
    	AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.alterar(aluno);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //        **EXCLUIR**
    
    public boolean excluir(Aluno aluno){
    	AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.excluir(aluno);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //      **PROCURAR POR CODIGO**
    
    public Aluno procurarPorCodigo(Aluno aluno){
    	AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.procurarPorCodigo(aluno);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **PROCURAR POR CPF**
    
    public Aluno procurarPorCpf(Aluno aluno){
    	AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.procurarPorCpf(aluno);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **EXISTE**
    
    public boolean existe(Aluno aluno){
    	AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.existe(aluno);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //      **PESQUISA POR TODOS**
    
    public List<Aluno> pesquisarTodos(){
    	AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.pesquisarTodos();
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////