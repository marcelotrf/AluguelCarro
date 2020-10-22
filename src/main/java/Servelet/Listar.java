/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelet;

import DAO.CarroDAO;
import Entidade.Carro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marce
 */
public class Listar extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Carro> listaCarros = CarroDAO.getCarros();
        request.setAttribute("listaCarros", listaCarros);
        
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/listaCarros.jsp");
        requestDispatcher.forward(request, response);  
    }

    

}
