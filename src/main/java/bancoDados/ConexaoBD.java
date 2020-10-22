/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marce
 */
public class ConexaoBD 
{
    //Singleton - bloco static, static nao precisa usar new
    // usado para carregar somente uma vez
    static 
    {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");// driver do meu banco        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
        
    //conexao e login do banco
    public static Connection getConexao() throws ClassNotFoundException, SQLException
    {
//        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");// driver do meu banco
        
        String url="jdbc:derby://localhost:1527//aluguelCarro";
        String user="senac";
        String password="senac";        
        return DriverManager.getConnection(url,user,password);
    }
    
}
