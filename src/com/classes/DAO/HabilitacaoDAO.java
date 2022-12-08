package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Aluno;
import com.classes.DTO.Habilitacao;

public class HabilitacaoDAO {
	
	final String NOMEDATABELA = "habilitacao";
    public boolean inserir(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (marca) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, habilitacao.getAluno());
            ps.setDate(2, (Date) habilitacao.getDataEmissao());
            ps.executeUpdate();
            ps.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET marca = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, habilitacao.getAluno());
            ps.setDate(2, (Date) habilitacao.getDataEmissao());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, habilitacao.getAluno());
            ps.setDate(2, (Date) habilitacao.getDataEmissao());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Habilitacao procurarPorData(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(2, (Date) habilitacao.getDataEmissao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Habilitacao obj = new Habilitacao();
            	obj.setAluno((Aluno) rs.getObject(1));
                obj.setDataEmissao(rs.getDate(2));
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
    public Habilitacao procurarPorAluno(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, habilitacao.getAluno());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Habilitacao obj = new Habilitacao();
            	obj.setAluno((Aluno) rs.getObject(1));
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
    public boolean existe(Habilitacao habilitacao) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE marca = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, habilitacao.getAluno());
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
    public List<Habilitacao> montarLista(ResultSet rs) {
        List<Habilitacao> listObj = new ArrayList<Habilitacao>();
        try {
            while (rs.next()) {
            	Habilitacao obj = new Habilitacao();
            	obj.setAluno((Aluno) rs.getObject(1));
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
