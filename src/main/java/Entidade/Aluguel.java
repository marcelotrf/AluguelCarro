/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author vickp
 */
public class Aluguel {
    
    private int id;
    private int idCarro;
    private int idCliente;
    private String dataLOcacao;
    private String dataDevolucao;
    private String juros;
    private String dataLimite;

    public Aluguel() {
    }

    public Aluguel(int id, int idCarro, int idCliente, String dataLOcacao, String dataDevolucao, String juros, String dataLimite) {
        this.id = id;
        this.idCarro = idCarro;
        this.idCliente = idCliente;
        this.dataLOcacao = dataLOcacao;
        this.dataDevolucao = dataDevolucao;
        this.juros = juros;
        this.dataLimite = dataLimite;
    }

    public Aluguel(int idCarro, int idCliente, String dataLOcacao, String dataDevolucao, String juros, String dataLimite) {
        this.idCarro = idCarro;
        this.idCliente = idCliente;
        this.dataLOcacao = dataLOcacao;
        this.dataDevolucao = dataDevolucao;
        this.juros = juros;
        this.dataLimite = dataLimite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCarro() {
        return idCarro;
    }

    public void setCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getCliente() {
        return idCliente;
    }

    public void setCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataLOcacao() {
        return dataLOcacao;
    }

    public void setDataLOcacao(String dataLOcacao) {
        this.dataLOcacao = dataLOcacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getJuros() {
        return juros;
    }

    public void setJuros(String juros) {
        this.juros = juros;
    }

    public String getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }
    
    
}
