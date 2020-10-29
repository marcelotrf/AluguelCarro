<%-- 
    Document   : cadastrarAluguel
    Created on : 29/10/2020, 03:10:40
    Author     : vickp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Aluguel</title>
    </head>
   <body class="container">
         <h1>Cadastro Aluguel</h1>
        <form action="CadastrarAluguel" method="POST">
            <p>Id</p>
            <input name="id" class="form-control" required="true"/><br/>
            <p>Preco</p>
            <input name="preco" class="form-control" required="true"/><br/>
            <p>Data de locacao</p>
            <input name="dataLocacao" class="form-control" required="true"/><br/>
            <p>Prazo de devolucao</p>
            <input name="prazoDevolucao" class="form-control" required="true"/><br/>
            <p>Data de devolucao</p>
            <input name="dataDevolucao" class="form-control" required="true"/><br/>
            <p>Juros</p>
            <input name="juros" class="form-control" required="true"/><br/>
            </br>
            <button type="submit" class="btn btn-primary">Enviar</button>
            
        </form>
    </body>
</html>
