<%-- 
    Document   : listaClientes
    Created on : 26/10/2020, 17:55:03
    Author     : biancagolin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
        
        <script lang="text/javascript">
            function mostrarModalExclusao(cpf, nome){
                console.log("mostrarModalExclusao", cpf);
                $("#nomeCliente").html(nome);
                $('#cpfCliente').val(cpf);
                $('#modalExclusao').modal('show')
            }
            
            function excluirCliente() {
                var cpf = $('#cpfCliente').val();
                console.log("Deletar cliente", cpf);
                $.get("ExcluirCliente?cpf="+cpf, function(resposta) {
                    $('#modalExclusao').modal('hide')
                    if (resposta === true) {
                        console.log("Funcionou");
                    } else {
                        console.log("Ops")
                    }
                    window.location.reload();
                });
            }
        </script>
                
    </head>
    <body class="container">
        <h1>Lista de Clientes</h1>
        <table class="table">
            <thead>
                <th>Nome</th>
                <th>CNH</th>
                <th>CPF</th>
                <th>Idade</th>
            </thead>  
            <tbody>
                <c:forEach var="cliente" items="${listaClientes}">
                    <tr>
                        <td>${cliente.nome}</td>
                        <td>${cliente.cnh}</td>
                        <td>${cliente.cpf}</td>
                        <td>${cliente.idade}</td>
                        <td><a href="AlterarCliente?cpf=${cliente.cpf}">Alterar</a></td>
                        <td><button type="button" class="btn btn-primary" onclick="mostrarModalExclusao(${cliente.cpf}, '${cliente.nome}')">Excluir</button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="modal fade" id="modalExclusao" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Confirmar Exclusão</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Tem certeza que deseja excluir cliente <label id="nomeCliente"/></label>?
                    <input id="cpfCliente" hidden="true"/>                   
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                        <button type="button" class="btn btn-primary" onclick="excluirCliente()">Sim</button>
                    </div>
                </div>
            </div>
        </div>
        <br/>
        <a href="index.jsp" class="btn btn-primary">Voltar</a>
    </body>
</html>
