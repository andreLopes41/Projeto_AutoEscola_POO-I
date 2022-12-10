package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Habilitacao;

public class HabilitacaoDAO {
	
	final String NOMEDATABELA = "habilitacao";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Inserir Nova Habilitacao no banco -------------------------------------		
	
    public boolean inserir(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (dataemissao,codaluno) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1,(Date) (habilitacao.getDataEmissao()));
            ps.setInt(2, habilitacao.getCodigoAluno());
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Alterar Dados da Habilitacao no banco -------------------------------------         
    
    public boolean alterar(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET dataemissao = ?, codaluno = ? WHERE codhabilitacao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1,(Date) (habilitacao.getDataEmissao()));
            ps.setInt(2, habilitacao.getCodigoAluno());
            ps.setInt(3, habilitacao.getCodigoHabilitacao());
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
    
//--------------------------- Excluir prova no Habilitacao -------------------------------------	      
    
    public boolean excluir(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codhabilitacao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, habilitacao.getCodigoHabilitacao());
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
    
//--------------------------- Procura Habilitacao por Data no banco -------------------------------------         
    
    public Habilitacao procurarPorData(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE dataemissao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) habilitacao.getDataEmissao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Habilitacao obj = new Habilitacao();
            	obj.setCodigoHabilitacao(rs.getInt(1));
            	obj.setDataEmissao(rs.getDate(2));
                obj.setCodigoAluno(rs.getInt(3));
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
    
//--------------------------- Procura Habilitacao por codigo no banco -------------------------------------         
    
    public Habilitacao procurarPorCodigo(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codhabilitacao = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, habilitacao.getCodigoHabilitacao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Habilitacao obj = new Habilitacao();
            	obj.setCodigoHabilitacao(rs.getInt(1));
            	obj.setDataEmissao(rs.getDate(2));
                obj.setCodigoAluno(rs.getInt(3));
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
    
//--------------------------- Verifica se a Habilitacao Existe no banco -------------------------------------        
    
    public boolean existe(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (dataemissao,codaluno) = (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1,(Date) (habilitacao.getDataEmissao()));
            ps.setInt(2, habilitacao.getCodigoAluno());
            ps.setDate(2, (Date) habilitacao.getDataEmissao());
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
    
//--------------------------- Pesquisa Por Todas as Habilitacoes no banco -------------------------------------       
    
    public List<Habilitacao> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Habilitacao> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Monta a Lista com Todas as habilitacoes no banco -------------------------------------    
    
    public List<Habilitacao> montarLista(ResultSet rs) {
        List<Habilitacao> listObj = new ArrayList<Habilitacao>();
        try {
            while (rs.next()) {
            	Habilitacao obj = new Habilitacao();
            	obj.setCodigoHabilitacao(rs.getInt(1));
            	obj.setDataEmissao(rs.getDate(2));
                obj.setCodigoAluno(rs.getInt(3));
                obj.setDataEmissao(rs.getDate(2));
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
