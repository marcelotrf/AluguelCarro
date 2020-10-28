/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entidade;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author biancagolin
 */

@Setter
@Getter
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

    @Override
    public String toString() {
        return String.format("Nome: %s <br/> CNH: %s <br/> CPF: %s <br/> Idade: %s <hr/>", nome, cnh, cpf, idade);
    }   
}
