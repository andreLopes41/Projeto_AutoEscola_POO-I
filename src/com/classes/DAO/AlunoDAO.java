package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Aluno;

public class AlunoDAO {

	final String NOMEDATABELA = "aluno";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Inserir Novo Aluno no banco -------------------------------------	
	
    public boolean inserir(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,cpf,categoriacnh) VALUES (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getCategoriaCNH());
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
    
//--------------------------- Alterar Dados do Aluno no banco -------------------------------------
    
    public boolean alterar(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ?, categoriacnh = ? WHERE codaluno = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getCategoriaCNH());
            ps.setInt(4, aluno.getCodigo());
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
    
    public boolean excluir(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codaluno = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, aluno.getCodigo());
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
    
//--------------------------- Procura Aluno por CPF no banco -------------------------------------
    
    public Aluno procurarPorCpf(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Aluno obj = new Aluno();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
                obj.setCategoriaCNH(rs.getString(4));
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
    
//--------------------------- Procura Aluno por Codigo no banco -------------------------------------	 
    
    public Aluno procurarPorCodigo(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codaluno = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, aluno.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Aluno obj = new Aluno();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
                obj.setCategoriaCNH(rs.getString(4));
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
    
    public boolean existe(Aluno aluno) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (nome,cpf,categoriacnh) = (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getCategoriaCNH());
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
    
//--------------------------- Pesquisa Por Todos os Alunos no banco -------------------------------------	
    
    public List<Aluno> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Aluno> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Monta a Lista com Todos os Alunos no banco -------------------------------------	 
    
    public List<Aluno> montarLista(ResultSet rs) {
        List<Aluno> listObj = new ArrayList<Aluno>();
        try {
            while (rs.next()) {
            	Aluno obj = new Aluno();
            	obj.setCodigo(rs.getInt(1));
    			obj.setNome(rs.getString(2));
    			obj.setCpf(rs.getString(3));
                obj.setCategoriaCNH(rs.getString(4));
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