/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;


public class Carro 
{
    //Colocar atributos do carro
    private int id;
    private String marca;
    private String placa;
    private double preco;
    
     
    
    // to String formatado
    @Override
    public String toString() {
        return String.format("Marca: %s <br/> "
                + "Tipo: %s <br/> Preço %f <br/>"
                + "Tamanho: %s <br/> Cor: %s <br/>"
                + "Placa: %s <br/><hr/> ", marca,preco,placa);
    }

    public Carro(String marca, String placa, double preco) {
        this.marca = marca;
        this.placa = placa;
        this.preco = preco;
    }

    public Carro(int id, String marca, String placa, double preco) {
        this.id = id;
        this.marca = marca;
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
   
    
}
