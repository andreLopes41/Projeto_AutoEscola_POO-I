package com.classes.BO;

import com.classes.DTO.Veiculo;
import com.classes.DAO.VeiculoDAO;
import java.util.List;

public class VeiculoBO {
	
	public boolean inserir(Veiculo veiculo){
        if (existe(veiculo) != true) {
        	VeiculoDAO veiculoDAO = new VeiculoDAO();
            return veiculoDAO.inserir(veiculo);
        }
        return false;
    }
    public boolean alterar(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.alterar(veiculo);
    }
    public boolean excluir(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.excluir(veiculo);
    }
    public Veiculo procurarPorCodigo(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.procurarPorCodigo(veiculo);
    }
    public Veiculo procurarPorMarca(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.procurarPorMarca(veiculo);
    }
    public boolean existe(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.existe(veiculo);
    }
    public List<Veiculo> pesquisarTodos(){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.pesquisarTodos();
    }
	
	

}
