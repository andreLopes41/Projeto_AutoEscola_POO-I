package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Pessoa;
import com.classes.Conexao.Conexao;

public class PessoaDAO {
	
	final String NOMEDATABELA = "pessoa";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Inserir Nova Pessoa no banco -------------------------------------	
	
    public boolean inserir(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,cpf) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
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
    
//--------------------------- Alterar Dados da Pessoa no banco -------------------------------------	
    
    public boolean alterar(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ? WHERE codpessoa = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setInt(3, pessoa.getCodigo());
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
    
//--------------------------- Excluir Pessoa no banco -------------------------------------	    
    
    public boolean excluir(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE (nome,cpf) = (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
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
    
//--------------------------- Procura Pessoa por Codigo no banco -------------------------------------	    

    public Pessoa procurarPorCodigo(Pessoa pessoa) {
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codpessoa = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setInt(1, pessoa.getCodigo());
    		ResultSet rs = ps.executeQuery();
    		if (rs.next()) {
    			Pessoa obj = new Pessoa();
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
    
//--------------------------- Procura Pessoa por CPF no banco -------------------------------------	    
    
    public Pessoa procurarPorCpf(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getCpf());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Pessoa obj = new Pessoa();
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
    
//--------------------------- Verifica se a Pessoa Existe no banco -------------------------------------	 
    
    public boolean existe(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (nome,cpf) = (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
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
    
//--------------------------- Pesquisa Por Todas as Pessoas no banco -------------------------------------	
    
    public List<Pessoa> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Pessoa> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Monta a Lista com Todas as Pessoas no banco -------------------------------------
    
    public List<Pessoa> montarLista(ResultSet rs) {
        List<Pessoa> listObj = new ArrayList<Pessoa>();
        try {
            while (rs.next()) {
            	Pessoa obj = new Pessoa();
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
