package com.classes.BO;

import com.classes.DTO.Veiculo;
import com.classes.DAO.VeiculoDAO;
import java.util.List;

public class VeiculoBO {
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Métodos -------------------------------------	
	
	//  **INSERIR**	
	
	public boolean inserir(Veiculo veiculo){
        if (existe(veiculo) != true) {
        	VeiculoDAO veiculoDAO = new VeiculoDAO();
            return veiculoDAO.inserir(veiculo);
        }
        return false;
    }
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//        **ALTERAR**	
	
    public boolean alterar(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.alterar(veiculo);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //        **EXCLUIR**    
    
    public boolean excluir(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.excluir(veiculo);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //      **PROCURAR POR CODIGO**
    
    public Veiculo procurarPorCodigo(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.procurarPorCodigo(veiculo);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **PROCURAR POR MARCA**    
    
    public Veiculo procurarPorMarca(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.procurarPorMarca(veiculo);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //       **EXISTE**    
    
    public boolean existe(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.existe(veiculo);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //      **PESQUISA POR TODOS**    
    
    public List<Veiculo> pesquisarTodos(){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.pesquisarTodos();
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////