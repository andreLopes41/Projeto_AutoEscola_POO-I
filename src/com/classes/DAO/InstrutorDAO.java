package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.Conexao.Conexao;
import com.classes.DTO.Instrutor;

public class InstrutorDAO {
	
	final String NOMEDATABELA = "instrutor";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

//--------------------------- Inserir Novo Instrutor no banco -------------------------------------	
	
    public boolean inserir(Instrutor instrutor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,cpf) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getCpf());
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
    
  //--------------------------- Alterar Dados do Instrutor no banco -------------------------------------	
    
    public boolean alterar(Instrutor instrutor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ? WHERE codinstrutor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getCpf());
            ps.setInt(3, instrutor.getCodigo());
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
    
  //--------------------------- Excluir Instrutor no banco -------------------------------------	    
    
    public boolean excluir(Instrutor instrutor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codinstrutor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, instrutor.getCodigo());
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
    
  //--------------------------- Procura Instrutor por CPF no banco -------------------------------------	    
    
    public Instrutor procurarPorCpf(Instrutor instrutor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, instrutor.getCpf());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Instrutor obj = new Instrutor();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
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
  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
  //--------------------------- Procura Instrutor por Codigo no banco -------------------------------------	    
    
    public Instrutor procurarPorCodigo(Instrutor instrutor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codinstrutor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, instrutor.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Instrutor obj = new Instrutor();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
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
    
  //--------------------------- Verifica se o Instrutor Existe no banco -------------------------------------	    
    
    public boolean existe(Instrutor instrutor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (nome,cpf) = (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getCpf());
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
    
  //--------------------------- Pesquisa Por Todos os Instrutores no banco -------------------------------------	    
    
    public List<Instrutor> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Instrutor> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
  //--------------------------- Monta a Lista com Todos os Instrutores no banco -------------------------------------	    
    
    public List<Instrutor> montarLista(ResultSet rs) {
        List<Instrutor> listObj = new ArrayList<Instrutor>();
        try {
            while (rs.next()) {
            	Instrutor obj = new Instrutor();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
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