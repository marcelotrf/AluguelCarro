<%-- 
    Document   : listaCarros
    Created on : 22 de out de 2020, 03:09:30
    Author     : marce
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Carros</title>
    </head>
    <body>
        <h1>Lista de Carros</h1>
        <table>
            <thead>
            <th>Marca</th>
            <th>Tipo</th>
<!--    adicionar depois        <th>CPF</th>-->
            </thead>
            <tbody>
                <c:forEach var="carro" items="${listaCarros}">
                    <tr>
                        <td>${carro.marca}</td>
                        <td>${carro.tipo}</td>                      
                    </tr>
                </c:forEach>
                    
            </tbody>
        </table>
        <br/>
        <a href="index.jsp">Voltar</a>
    </body>
</html>
