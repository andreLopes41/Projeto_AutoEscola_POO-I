package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Aluno;
import com.classes.DTO.Provas;

public class ProvasDAO {
	
	final String NOMEDATABELA = "provas";
    public boolean inserir(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (dia) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setFloat(2, provas.getNota());
            ps.setObject(3, provas.getAluno());
            ps.executeUpdate();
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET marca = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setFloat(2, provas.getNota());
            ps.setObject(3, provas.getAluno());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setFloat(2, provas.getNota());
            ps.setObject(3, provas.getAluno());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Provas procurarPorData(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Provas obj = new Provas();
                obj.setDia(rs.getDate(1));
                obj.setNota(rs.getFloat(2));
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
        	 e.printStackTrace();
             return null;
        }
    }
    public Provas procurarPorAluno(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(3, provas.getAluno());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Provas obj = new Provas();
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
    public boolean existe(Provas provas) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, (Date) provas.getDia());
            ps.setFloat(2, provas.getNota());
            ps.setObject(3, provas.getAluno());
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
    public List<Provas> montarLista(ResultSet rs) {
        List<Provas> listObj = new ArrayList<Provas>();
        try {
            while (rs.next()) {
            	Provas obj = new Provas();
            	 obj.setDia(rs.getDate(1));
                 obj.setNota(rs.getFloat(2));
                 obj.setAluno((Aluno) rs.getObject(3));
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
