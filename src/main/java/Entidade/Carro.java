/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marce
 */

@Getter
@Setter
public class Carro 
{
    //Colocar atributos do carro
    private String marca;
    private String tipo;
    private String tamanho;
    private String cor;
    private String placa;
    private double preco;
    
    //criar construtor
    
//    public Carro(String marca, String tipo, String tamanho, String cor, String placa, double preco)
//    {
//        this.marca=marca;
//        this.tipo=tipo;
//        this.tamanho=tamanho;
//        this.cor = cor;
//        this.placa = placa;
//        this.preco = preco;
//    }    
    // apagar esse construtor utilizado apenas no teste
    public Carro(String marca, String tipo)
    {
        this.marca=marca;
        this.tipo=tipo;
    }
    
    // to String formatado
    @Override
    public String toString() {
        return String.format("Marca: %s <br/> "
                + "Tipo: %s <br/> Preço %f <br/>"
                + "Tamanho: %s <br/> Cor: %s <br/>"
                + "Placa: %s <br/><hr/> ", marca, tipo,preco, tamanho, cor, placa);
    }
    
}
