package br.com.designpattern.builder.carro;

import br.com.designpattern.builder.componentes.Cor;
import br.com.designpattern.builder.componentes.ModeloCarro;

public class Carro {
    private final ModeloCarro modelo;
    private final Cor cor;
    private final int ano;

    public Carro(ModeloCarro modelo, Cor cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public ModeloCarro getModelo() {
        return modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
}
