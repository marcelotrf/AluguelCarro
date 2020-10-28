<%-- 
    Document   : cadastrarCliente
    Created on : 26/10/2020, 18:15:51
    Author     : biancagolin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body class="container">
        <h1>Cadastro</h1>
        <form action="CadastrarCliente" method="POST">
            <p>Nome</p>
            <input name="nome" class="form-control" required="true"/><br/>
            <p>CNH</p>
            <input name="cnh" class="form-control" required="true"/><br/>
            <p>CPF</p>
            <input name="cpf" class="form-control" required="true"/><br/>
            <p>Idade</p>
            <input name="idade" class="form-control" required="true"/><br/>
            </br>
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
