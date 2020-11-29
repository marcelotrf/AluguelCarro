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
public class Usuario {
    private int id;
    private String email;
    private String senha;
    private Funcionario idFuncionario;

    public Usuario() {
    }

    public Usuario(int id, String email, String senha, Funcionario idFuncionario) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.idFuncionario = idFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    
}
