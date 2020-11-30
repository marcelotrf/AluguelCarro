/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import com.mycompany.dao.DetalhesAluguelDAO;
import com.mycompany.entidade.DetalhesAluguel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author biancagolin
 */
@WebServlet(name = "ListarDetalhesAluguel", urlPatterns = {"/ListarDetalhesAluguel"})
public class ListarDetalhesAluguel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<DetalhesAluguel> listaDetails= DetalhesAluguelDAO.getDetalhesAlguel();
        request.setAttribute("listaDetails", listaDetails);
        
        RequestDispatcher requestDispacher = getServletContext()
                .getRequestDispatcher("/listaDetalhes.jsp");
        requestDispacher.forward(request, response);
    }
}
