<%-- 
    Document   : alterarAluguel
    Created on : 29/10/2020, 02:21:45
    Author     : vickp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Aluguel</title>
    </head>
    <body class="container">
        <h1>Alteração de aluguel: ${aluguel.id}</h1>
        <form action="AlterarAluguel" method="POST">
            <p>Id</p>
            <input name="id" value="${aluguel.id}" class="form-control"/><br/>
            <p>Preco</p>
            <input name="preco" value="${aluguel.preco}" class="form-control"/><br/>
            <p>Data de locacao</p>
            <input name="dataLocacao" value="${aluguel.dataLocacao}" class="form-control"/><br/>
            <p>Prazo de devolucao</p>
            <input name="prazoDevolucao" value="${aluguel.prazoDevolucao}" class="form-control"/><br/>
            <p>Data de devolucao</p>
            <input name="dataDevolucao" value="${aluguel.dataDevolucao}" class="form-control"/><br/>
            <p>Juros</p>
            <input name="juros" value="${aluguel.juros}" class="form-control"/><br/>
            </br>
            <button type="submit" class="btn btn-primary">Enviar</button>

        </form>
    </body>
    </html>
