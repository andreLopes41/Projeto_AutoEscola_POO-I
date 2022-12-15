package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Veiculo;
import com.classes.Conexao.Conexao;

public class VeiculoDAO {
	
	final String NOMEDATABELA = "veiculo";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Inserir Novo Veiculo no banco -------------------------------------
	
    public boolean inserir(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (tipo,marca) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getTipo());
            ps.setString(2, veiculo.getMarca());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Alterar Dados do Veiculo no banco -------------------------------------
    
    public boolean alterar(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET tipo = ?, marca = ? WHERE codveiculo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getTipo());
            ps.setString(2, veiculo.getMarca());
            ps.setInt(3, veiculo.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Excluir Aluno no banco -------------------------------------	
    
    public boolean excluir(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codveiculo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculo.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Procura Aluno por Codigo no banco -------------------------------------   
    
    public Veiculo procurarPorCodigo(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codveiculo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculo.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Veiculo obj = new Veiculo();
            	obj.setCodigo(rs.getInt(1));
            	 obj.setTipo(rs.getString(2));
                obj.setMarca(rs.getString(3));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }    
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Procura Aluno por Marca no banco -------------------------------------    
    
    public Veiculo procurarPorMarca(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getMarca());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Veiculo obj = new Veiculo();
            	obj.setCodigo(rs.getInt(1));
            	 obj.setTipo(rs.getString(2));
                obj.setMarca(rs.getString(3));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
   
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Verifica se o Veiculo Existe no banco -------------------------------------    
    
    public boolean existe(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (tipo,marca) = (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getTipo());
            ps.setString(2, veiculo.getMarca());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Pesquisa Por Todos os Veiculos no banco -------------------------------------  
    
    public List<Veiculo> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Veiculo> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Monta a Lista com Todos os Veiculos no banco -------------------------------------    
    
    public List<Veiculo> montarLista(ResultSet rs) {
        List<Veiculo> listObj = new ArrayList<Veiculo>();
        try {
            while (rs.next()) {
            	Veiculo obj = new Veiculo();
            	obj.setCodigo(rs.getInt(1));
           	 obj.setTipo(rs.getString(2));
               obj.setMarca(rs.getString(3));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
