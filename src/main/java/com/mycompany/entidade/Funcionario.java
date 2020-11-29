/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entidade;

/**
 *
 * @author biancagolin
 */
public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private Loja idLoja;

    public Funcionario(int id, String nome, String cargo, Loja idLoja) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.idLoja = idLoja;
    }
    
    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Loja getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Loja idLoja) {
        this.idLoja = idLoja;
    }
    
    
}
