/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Carro;
import Servelet.Listar;
import bancoDados.ConexaoBD;
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
 * @author marce
 */
public class CarroDAO 
{
    // criar metodo get
    public static List<Carro> getCarros()
    {
        List<Carro> listaCarros = new ArrayList();
        // buscar no banco de dados tabela carro
         try {
                Connection con = ConexaoBD.getConexao();
                String query = "select * from carro";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    // atributos do banco
                    int id = rs.getInt("id");
                    String marca = rs.getString("nome");
                    String placa = rs.getString("placa");
                    double preco = rs.getDouble("preco");
                // criar atributos no banco    Long cpf = rs.getLong("cpf");
                    listaCarros.add(new Carro(id,marca,placa,preco));
                }                    
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            }
         return listaCarros;
        
    }
    
    public static Carro addCarro(Carro carro) throws ClassNotFoundException, SQLException
    {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into cliente(nome,marca) values (?,?,?)";
        return null;
        
    }
    public static Carro buscaCarroId(int id) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "select * from carro where id=?";
        return null;
    }
    public static Carro alteraCarro(Carro carro) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "UPDATE carro SET marca = ?, placa = ?, preco = ? WHERE id = ?;";
        return null;
    }
    public static Carro deletaCarro(Carro carro) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "DELETE FROM carro WHERE id = ?;";
        return null;
    }
    
}
