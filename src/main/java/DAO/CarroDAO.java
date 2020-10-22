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
                    String marca = rs.getString("nome");
                    String tipo = rs.getString("marca"); 
                // criar atributos no banco    Long cpf = rs.getLong("cpf");
                    listaCarros.add(new Carro(marca,tipo));
                }                    
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            }
         return listaCarros;
        
    }
    
    public static void addCarro(Carro carro) throws ClassNotFoundException, SQLException
    {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into cliente(nome,marca) values (?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, carro.getMarca());
        ps.setString(2, carro.getTipo());
      // adicionar depois  ps.setLong(3, cliente.getCpf());
        
        ps.execute();
        
    }
    
}
