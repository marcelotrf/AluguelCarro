/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.bd.ConexaoBD;
import com.mycompany.entidade.Carro;
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
public class CarroDAO {

    public static List<Carro> getCarro() {
        List<Carro> listaCarro = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from carro";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String marca = rs.getString("marca");
                int qntPortas = rs.getInt("qntPortas");
                String placa = rs.getString("placa");
                double preco = rs.getDouble("preco");
                listaCarro.add(new Carro(marca, qntPortas, placa, preco));

            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CarroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaCarro;
    }

    public static void addCarro(Carro carro) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into carro(marca, qntPortas, placa, preco) values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, carro.getMarca());
        ps.setInt(2, carro.getQntPortas());
        ps.setString(3, carro.getPlaca());
        ps.setDouble(4, carro.getPreco());
        ps.execute();

    }

    public static Carro getCarro(String placa) {
        Carro carro = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from carro where placa=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, placa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String marca = rs.getString("marca");
                int qntPortas = rs.getInt("qntPortas");
                double preco = rs.getDouble("preco");
                carro = new Carro(marca, qntPortas, placa, preco);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CarroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return carro;
    }

    public static void updateCarro(Carro carro) throws SQLException, ClassNotFoundException {
        try {
            Connection con = ConexaoBD.getConexao();
            String query = ("update carro set marca= ?, qntPortas= ?, preco= ? where placa= ?");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, carro.getMarca());
            ps.setInt(2, carro.getQntPortas());
            ps.setDouble(3, carro.getPreco());
            ps.setString(4, carro.getPlaca());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteCarro(String placa) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = ("delete from carro where placa= ?");
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, placa);
        ps.execute();
    }
}
