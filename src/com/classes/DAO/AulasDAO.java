package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Aulas;


public class AulasDAO {
	
	final String NOMEDATABELA = "aulas";
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//--------------------------- Inserir Nova Aula no banco -------------------------------------
	
    public boolean inserir(Aulas aulas) {
        try {
        	Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (dia,codveiculo,codaluno,codinstrutor) VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setDate(1, (Date) aulas.getDia());
            ps.setInt(2, aulas.getCodigoVeiculo());
            ps.setInt(3, aulas.getCodigoAluno());
            ps.setInt(4, aulas.getCodigoInstrutor());
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Alterar Dados da aula no banco -------------------------------------    
    
    public boolean alterar(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET  dia = ?, codveiculo = ?, codaluno = ?, codinstrutor = ? WHERE codaula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) aulas.getDia());
            ps.setInt(2, aulas.getCodigoVeiculo());
            ps.setInt(3, aulas.getCodigoAluno());
            ps.setInt(4, aulas.getCodigoInstrutor());
            ps.setInt(5, aulas.getCodigoAula());
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
    
//--------------------------- Excluir aula no banco -------------------------------------	    
    
    public boolean excluir(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codaula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, aulas.getCodigoAula());
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
    
//--------------------------- Procura aula por Data no banco -------------------------------------    
    
    public Aulas procurarPorData(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE dia = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) aulas.getDia());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Aulas obj = new Aulas();
            	obj.setDia(rs.getDate(2));
                obj.setCodigoAula(rs.getInt(1));
           	 	obj.setCodigoVeiculo(rs.getInt(3));
    			obj.setCodigoAluno(rs.getInt(4));
    			obj.setCodigoInstrutor(rs.getInt(5));
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
    
//--------------------------- Procura aula por Codigo no banco -------------------------------------    
    
    public Aulas procurarPorCodigo(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codaula = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, aulas.getCodigoAula());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Aulas obj = new Aulas();
            	obj.setDia(rs.getDate(2));
                obj.setCodigoAula(rs.getInt(1));
           	 	obj.setCodigoVeiculo(rs.getInt(3));
    			obj.setCodigoAluno(rs.getInt(4));
    			obj.setCodigoInstrutor(rs.getInt(5));
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
    
//--------------------------- Verifica se a aula Existe no banco -------------------------------------   
    
    public boolean existe(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE (codveiculo,codaluno,codinstrutor) = (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, aulas.getCodigoVeiculo());
            ps.setInt(2, aulas.getCodigoAluno());
            ps.setInt(3, aulas.getCodigoInstrutor());
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
    
//--------------------------- Pesquisa Por Todas as aulas no banco -------------------------------------	   
    
    public List<Aulas> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Aulas> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
//--------------------------- Monta a Lista com Todas as aulas no banco -------------------------------------    
    
    public List<Aulas> montarLista(ResultSet rs) {
        List<Aulas> listObj = new ArrayList<Aulas>();
        try {
            while (rs.next()) {
            	Aulas obj = new Aulas();
            	obj.setDia(rs.getDate(2));
                obj.setCodigoAula(rs.getInt(1));
           	 	obj.setCodigoVeiculo(rs.getInt(3));
    			obj.setCodigoAluno(rs.getInt(4));
    			obj.setCodigoInstrutor(rs.getInt(5));
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