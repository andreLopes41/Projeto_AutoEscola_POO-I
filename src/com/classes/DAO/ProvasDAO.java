package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Provas;

public class ProvasDAO {
	
	final String NOMEDATABELA = "provas";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Inserir Nova Prova no banco -------------------------------------	
	
    public boolean inserir(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (dia,codaluno,nota) VALUES (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setInt(2, provas.getCodigoAluno());
            ps.setFloat(3, provas.getNota());
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Alterar Dados da prova no banco -------------------------------------       
    
    public boolean alterar(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET dia = ?, codaluno = ?, nota = ? WHERE codprova = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setInt(2, provas.getCodigoAluno());
            ps.setFloat(3, provas.getNota());
            ps.setInt(4, provas.getCodigoProva());
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
    
//--------------------------- Excluir prova no banco -------------------------------------	        
    
    public boolean excluir(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codprova = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, provas.getCodigoProva());
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
    
//--------------------------- Procura prova por Data no banco -------------------------------------     
    
    public Provas procurarPorData(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE dia = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Provas obj = new Provas();
                obj.setCodigoProva(rs.getInt(1));
                obj.setDia(rs.getDate(2));
                obj.setCodigoAluno(rs.getInt(3));
                obj.setNota(rs.getFloat(4));
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
    
//--------------------------- Procura prova por Codigo no banco -------------------------------------     
    
    public Provas procurarPorCodigo(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codprova = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, provas.getCodigoProva());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Provas obj = new Provas();
            	obj.setCodigoProva(rs.getInt(1));
                obj.setDia(rs.getDate(2));
                obj.setCodigoAluno(rs.getInt(3));
                obj.setNota(rs.getFloat(4));
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
    
//--------------------------- Verifica se a prova Existe no banco -------------------------------------       
    
    public boolean existe(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (dia,codaluno,nota) = (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setInt(2, provas.getCodigoAluno());
            ps.setFloat(3, provas.getNota());
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
    
//--------------------------- Pesquisa Por Todas as provas no banco -------------------------------------    
    
    public List<Provas> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Provas> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Monta a Lista com Todas as provas no banco -------------------------------------     
    
    public List<Provas> montarLista(ResultSet rs) {
        List<Provas> listObj = new ArrayList<Provas>();
        try {
            while (rs.next()) {
            	Provas obj = new Provas();
            	obj.setCodigoProva(rs.getInt(1));
                obj.setDia(rs.getDate(2));
                obj.setCodigoAluno(rs.getInt(3));
                obj.setNota(rs.getFloat(4));
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