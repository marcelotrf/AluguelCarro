/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Aluguel;
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
 * @author vickp
 */
public class AluguelDAO {
    
     public static List<Aluguel> getCarros() throws SQLException
    {
        List<Aluguel> listaAluguel = new ArrayList();
        // buscar no banco de dados tabela carro
         try {
                Connection con = ConexaoBD.getConexao();
                String query = "select * from Aluguel";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    // atributos do banco
                    int idCarro = rs.getInt("idCarro");
                    int idCliente = rs.getInt("idCiente");
                    int id = rs.getInt("id");
                    String dataLocacao = rs.getString("dataLocacao");
                    String dataDevolucao = rs.getString("dataDevolucao");
                    String juros = rs.getString("juros");
                    String dataLimite = rs.getString("dataLimite");
                // criar atributos no banco    Long cpf = rs.getLong("cpf");
                    listaAluguel.add(new Aluguel(id,idCarro,idCliente,dataLocacao,dataDevolucao, juros, dataLimite));
                }                    
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            }
         return listaAluguel;
        
    }
    
    public static Aluguel addAluguel(Aluguel aluguel) throws ClassNotFoundException, SQLException
    {
        Connection con = ConexaoBD.getConexao();
        String query = "insert into aluguel(dataLocacao,dataDevolucao, juros, dataLimite) values (?,?,?,?)";
        return null;
        
    }
    public static Aluguel buscaCarroId(int id) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "select * from Aluguel where id=?";
        return null;
    }
    public static Aluguel alteraAluguel(Aluguel aluguel) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "UPDATE Aluguel SET dataLocacao = ?, dataDevolucao = ?, juros = ?,dataLimite=? WHERE id = ?;";
        return null;
    }
    public static Aluguel deletaAluguel(Aluguel alguel) throws ClassNotFoundException, SQLException{
        Connection con = ConexaoBD.getConexao();
        String query = "DELETE FROM Aluguel WHERE id = ?;";
        return null;
    }
}
