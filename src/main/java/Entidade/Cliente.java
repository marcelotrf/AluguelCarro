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
public class Cliente {
    private int id;
    private int idade;
    private String CNH;
    private String nome;
    private String telefone;

    public Cliente() {
    }

    public Cliente(int idade, String CNH, String nome, String telefone) {
        this.idade = idade;
        this.CNH = CNH;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Cliente(int id, int idade, String CNH, String nome, String telefone) {
        this.id = id;
        this.idade = idade;
        this.CNH = CNH;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
