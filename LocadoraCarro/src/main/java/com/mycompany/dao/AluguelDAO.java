/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.bd.ConexaoBD;
import com.mycompany.entidade.Aluguel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vickp
 */
public class AluguelDAO {
       
    public static List<Aluguel> getAluguel() {
        List<Aluguel> listaAluguel = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from aluguel";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                double preco = rs.getDouble("preco");
                String dataLocacao = rs.getString("dataLocacao");
                String prazoDevolucao = rs.getString("prazoDevolucao");
                String dataDevolucao = rs.getString("dataDevolucao");
                double juros = rs.getDouble("juros");
                listaAluguel.add(new Aluguel(id, preco, dataLocacao, prazoDevolucao, dataDevolucao, juros));

            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaAluguel;
    }

    public static void addAluguel(Aluguel aluguel) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into aluguel(id, preco, dataLocacao, prazoDevolucao, dataDevolucao, juros) values (?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, aluguel.getId());
        ps.setDouble(2, aluguel.getPreco());
        ps.setString(3, aluguel.getDataLocacao());
        ps.setString(4, aluguel.getPrazoDevolucao());
        ps.setString(5, aluguel.getDataDevolucao());
        ps.setDouble(6, aluguel.getJuros());
        ps.execute();

    }

    public static Aluguel getAluguel(String id) {
        Aluguel aluguel = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from aluguel where id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double preco = rs.getDouble("preco");
                String dataLocacao = rs.getString("dataLocacao");
                String prazoDevolucao = rs.getString("prazoDevolucao");
                String dataDevolucao = rs.getString("dataDevolucao");
                double juros = rs.getDouble("juros");
                aluguel = new Aluguel(id, preco, dataLocacao, prazoDevolucao, dataDevolucao, juros);
                
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return aluguel;
    }

    public static void updateAluguel(Aluguel aluguel) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = ("update aluguel set preco= ?, dataLocacao= ?, prazoDevolucao= ?, dataDevolucao= ?, juros= ? where id= ?");
        PreparedStatement ps = con.prepareStatement(query);
        ps.setDouble(1, aluguel.getPreco());
        ps.setString(2, aluguel.getDataLocacao());
        ps.setString(3, aluguel.getPrazoDevolucao());
        ps.setString(4, aluguel.getDataDevolucao());
        ps.setDouble(5, aluguel.getJuros());
        ps.setString(6, aluguel.getId());
        ps.execute();
    }

    public static void deleteAluguel(String id) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = ("delete from aluguel where id= ?");
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, id);
        ps.execute();
    }
}
