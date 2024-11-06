package br.com.designpattern.builder;

import br.com.designpattern.builder.carro.Carro;
import br.com.designpattern.builder.carro.CarroBuilder;
import br.com.designpattern.builder.fabricacao.Fabricacao;

public class CarroApp {
    public static void main(String[] args) {
        Fabricacao fabricacao = new Fabricacao();

        CarroBuilder builder = new CarroBuilder();
        fabricacao.fabricarSedan(builder);

        Carro carro = builder.resultado();
        System.out.println("Carro: " + carro.getModelo() + " - " + carro.getCor() + " - " + carro.getAno());
    }
}