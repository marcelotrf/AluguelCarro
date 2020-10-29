    <%-- 
    Document   : listaAluguel
    Created on : 29/10/2020, 02:22:13
    Author     : vickp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <%@include file="header.jsp"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista De Alugueis</title>
    </head>
    <script lang="text/javascript">
            function mostrarModalExclusao(id, preco){
                console.log("mostrarModalExclusao", id);
                $("#precoAluguel").html(preco);
                $('#idAluguel').val(id);
                $('#modalExclusao').modal('show');
            }
            
            function excluirAluguel() {
                var id = $('#idAluguel').val();
                console.log("Deletar aluguel", id);
                $.get("ExcluirAluguel?id="+id, function(resposta) {
                    $('#modalExclusao').modal('hide');
                    if (resposta === true) {
                        console.log("Funcionou");
                    } else {
                        console.log("Ops");
                    }
                    window.location.reload();
                });
            }
        </script>
     <body class="container">
        <h1>Lista De Alugueis</h1>
        <table class="table">
            <thead>
                <th>Id</th>
                <th>Preco</th>
                <th>Data de locacao</th>
                <th>Prazo de devolucao</th>
                <th>Data de devolucao</th>
                <th>Juros</th>
            </thead>  
            <tbody>
                <c:forEach var="aluguel" items="${listaAluguel}">
                    <tr>
                        <td>${aluguel.id}</td>
                        <td>${aluguel.preco}</td>
                        <td>${aluguel.dataLocacao}</td>
                        <td>${aluguel.prazoDevolucao}</td>
                        <td>${aluguel.dataDevolucao}</td>
                        <td>${aluguel.juros}</td>
                        <td><a href="AlterarAluguel?id=${aluguel.id}">Alterar</a></td>
                        <td><button type="button" class="btn btn-primary" onclick="mostrarModalExclusao('${aluguel.id}', '${aluguel.preco}')">Excluir</button></td>
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
                        Tem certeza que deseja excluir este registro de aluguel <label id="id"/></label>?
                    <input id="idAluguel" hidden="true"/>                   
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                        <button type="button" class="btn btn-primary" onclick="excluirAluguel()">Sim</button>
                    </div>
                </div>
            </div>
        </div>
        <br/>
        <a href="index.jsp" class="btn btn-primary">Voltar</a>
    </body>
</html>
