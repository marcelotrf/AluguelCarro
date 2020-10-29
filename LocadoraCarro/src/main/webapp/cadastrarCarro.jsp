<%-- 
    Document   : cadastrarCarro
    Created on : 29/10/2020, 02:03:44
    Author     : vickp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Carros</title>
    </head>
    <body class="container">
         <h1>Cadastro Carro</h1>
        <form action="CadastrarCarro" method="POST">
            <p>Marca</p>
            <input name="marca" class="form-control" required="true"/><br/>
            <p>Portas</p>
            <input name="qntPortas" class="form-control" required="true"/><br/>
            <p>Placa</p>
            <input name="placa" class="form-control" required="true"/><br/>
            <p>Preco</p>
            <input name="preco" class="form-control" required="true"/><br/>
            </br>
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
