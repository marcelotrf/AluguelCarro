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

public class Cliente {
    private String nome;
    private String cnh;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cnh, String cpf, int idade) {
        this.nome = nome;
        this.cnh = cnh;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s <br/> CNH: %s <br/> CPF: %s <br/> Idade: %s <hr/>", nome, cnh, cpf, idade);
    }   
}
