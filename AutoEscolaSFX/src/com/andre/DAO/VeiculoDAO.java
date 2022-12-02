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
    public boolean inserir(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (marca) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getMarca());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET marca = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getMarca());
            ps.setInt(2, veiculo.getcodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculo.getcodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Veiculo procurarPorCodigo(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculo.getcodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Veiculo obj = new Veiculo();
                obj.setcodigo(rs.getInt(1));
                obj.setMarca(rs.getString(2));
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
        	 e.printStackTrace();
             return null;
        }
    }
    public Veiculo procurarPorMarca(Veiculo veiculo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculo.getMarca());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Veiculo obj = new Veiculo();
                obj.setcodigo(rs.getInt(1));
                obj.setMarca(rs.getString(2));
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
    public boolean existe(Veiculo marca) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, marca.getMarca());
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
    public List<Veiculo> montarLista(ResultSet rs) {
        List<Veiculo> listObj = new ArrayList<Veiculo>();
        try {
            while (rs.next()) {
            	Veiculo obj = new Veiculo();
                obj.setcodigo(rs.getInt(1));
                obj.setMarca(rs.getString(2));
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
