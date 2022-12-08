package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Aluno;
import com.classes.DTO.Aulas;
import com.classes.DTO.Instrutor;
import com.classes.DTO.Veiculo;

public class AulasDAO {
	
	final String NOMEDATABELA = "aulas";
    public boolean inserir(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (veiculo,aluno,instrutor) VALUES (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, aulas.getVeiculo().getTipo());
            ps.setObject(2, aulas.getAluno().getNome());
            ps.setObject(3, aulas.getInstrutor().getNome());
            ps.executeUpdate();
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET marca = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) aulas.getDia());
            ps.setObject(2, aulas.getVeiculo());
            ps.setObject(3, aulas.getAluno());
            ps.setObject(4, aulas.getInstrutor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) aulas.getDia());
            ps.setObject(2, aulas.getVeiculo());
            ps.setObject(3, aulas.getAluno());
            ps.setObject(4, aulas.getInstrutor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Aulas procurarPorData(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) aulas.getDia());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Aulas obj = new Aulas();
                obj.setDia(rs.getDate(1));
                obj.setVeiculo((Veiculo) rs.getObject(2));
                obj.setAluno((Aluno) rs.getObject(3));
                obj.setInstrutor((Instrutor) rs.getObject(4));
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
    public Aulas procurarPorAluno(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(3, aulas.getAluno());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Aulas obj = new Aulas();
            	obj.setAluno((Aluno) rs.getObject(3));
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
    public boolean existe(Aulas aulas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) aulas.getDia());
            ps.setObject(2, aulas.getVeiculo());
            ps.setObject(3, aulas.getAluno());
            ps.setObject(4, aulas.getInstrutor());
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
    public List<Aulas> montarLista(ResultSet rs) {
        List<Aulas> listObj = new ArrayList<Aulas>();
        try {
            while (rs.next()) {
            	Aulas obj = new Aulas();
            	 obj.setDia(rs.getDate(1));
                 obj.setVeiculo((Veiculo) rs.getObject(2));
                 obj.setAluno((Aluno) rs.getObject(3));
                 obj.setInstrutor((Instrutor) rs.getObject(4));
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
