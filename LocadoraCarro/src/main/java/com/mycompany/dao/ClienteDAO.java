/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.bd.ConexaoBD;
import com.mycompany.entidade.Cliente;
import com.mycompany.servlet.ServletBD;
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
 * @author biancagolin
 */
public class ClienteDAO {

    public static List<Cliente> getClientes() {
        List<Cliente> listaCliente = new ArrayList();
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from cliente";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cnh = rs.getString("cnh");
                String cpf = rs.getString("cpf");
                int idade = rs.getInt("idade");
                listaCliente.add(new Cliente(nome, cnh, cpf, idade));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaCliente;
    }
    
    public static void addCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into cliente(nome, cnh, cpf, idade) values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCnh());
        ps.setString(3, cliente.getCpf());
        ps.setInt(4, cliente.getIdade());
        ps.execute();
        
    }
    
    public static Cliente getCliente(String cpf) {
        Cliente cliente = null;
        try {
            Connection con = ConexaoBD.getConexao();
            String query = "select * from cliente where cpf=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cnh = rs.getString("cnh");
                int idade = rs.getInt("idade");
                cliente = new Cliente(nome, cnh, cpf, idade);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    }
    
        public static void updateCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
            Connection con = ConexaoBD.getConexao();
            String query = ("update cliente set nome= ?, cnh= ?, idade= ? where cpf= ?");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCnh());
            ps.setInt(3, cliente.getIdade());
            ps.setString(4, cliente.getCpf());
            ps.execute();
        }
        
    public static void deleteCliente(String cpf) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoBD.getConexao();
        String query = ("delete from cliente where cpf= ?");
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cpf);
        ps.execute();
    }
}
