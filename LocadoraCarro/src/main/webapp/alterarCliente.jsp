<%-- 
    Document   : alterarCliente
    Created on : 27/10/2020, 00:31:37
    Author     : biancagolin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Cliente</title>
    </head>
    <body class="container">
        <h1>Alteração de cadastro: ${cliente.nome}</h1>
        <form action="AlterarCliente" method="POST">
            <p>Nome</p>
            <input name="nome" value="${cliente.nome}" class="form-control"/><br/>
            <p>CNH</p>
            <input name="cnh" value="${cliente.cnh}" class="form-control"/><br/>
            <p>CPF</p>
            <input name="cpf" value="${cliente.cpf}" readonly="true" class="form-control"/><br/>
            <p>Idade</p>
            <input name="idade" value="${cliente.idade}" class="form-control"/><br/>
            </br>
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
