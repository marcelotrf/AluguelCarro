/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import com.mycompany.dao.AluguelDAO;
import com.mycompany.entidade.Aluguel;
import com.mycompany.utils.Utils;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vickp
 */
@WebServlet(name = "CadastrarAluguel", urlPatterns = {"/CadastrarAluguel"})
public class CadastrarAluguel extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String precoStr = request.getParameter("preco");
        String dataLocacao = request.getParameter("dataLocacao");
        String prazoDevolucao = request.getParameter("prazoDevolucao");
        String dataDevolucao = request.getParameter("dataDevolucao");
        String jurosStr = request.getParameter("juros");
        double preco = Double.parseDouble(precoStr);
        double juros = Double.parseDouble(jurosStr);

        Aluguel aluguel = new Aluguel(id, preco, dataLocacao, prazoDevolucao, dataDevolucao, juros);
        try {
            AluguelDAO.addAluguel(aluguel);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CadastrarAluguel.class.getName()).log(Level.SEVERE, null, ex);
            Utils.mostrarTelaDeErro(ex, request, response);
        }
    }
}
