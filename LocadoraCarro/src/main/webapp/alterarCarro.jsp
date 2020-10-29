<%-- 
    Document   : alterarCarro
    Created on : 29/10/2020, 02:04:03
    Author     : vickp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Carro</title>
    </head>
    <body class="container">
        <h1>Alteração de cadastro de carro: ${carro.marca}</h1>
        <form action="AlterarCarro" method="POST">
            <p>Marca</p>
            <input name="marca" value="${carro.marca}" class="form-control"/><br/>
            <p>Portas</p>
            <input name="qntPortas" value="${carro.qntPortas}" class="form-control"/><br/>
            <p>Placa</p>
            <input name="placa" value="${carro.placa}" readonly="true" class="form-control"/><br/>
            <p>Preco</p>
            <input name="preco" value="${carro.preco}" class="form-control"/><br/>
            </br>
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
