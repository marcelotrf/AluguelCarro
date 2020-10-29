/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entidade;

/**
 *
 * @author vickp
 */
public class Carro {

    private String marca;
    private int qntPortas;
    private String placa;
    private double preco;

    public Carro(String marca, int qntPortas, String placa, double preco) {
        this.marca = marca;
        this.qntPortas = qntPortas;
        this.placa = placa;
        this.preco = preco;
    }

    public Carro() {
    }

     
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s <br/> Qnt Portas: %s <br/> Placa: %s <br/> Preco: %s <hr/>", marca, qntPortas, placa, preco);
    }
}
