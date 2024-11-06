package br.com.designpattern.builder.carro;

import br.com.designpattern.builder.builders.IBuilder;
import br.com.designpattern.builder.componentes.Cor;
import br.com.designpattern.builder.componentes.ModeloCarro;

public class CarroBuilder implements IBuilder {
    private ModeloCarro modelo;
    private Cor cor;
    private int ano;

    @Override
    public void modelo(ModeloCarro modeloCarro) {
        this.modelo = modeloCarro;
    }

    @Override
    public void cor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public void ano(int ano) {
        this.ano = ano;
    }

    public Carro resultado() {
        return new Carro(modelo, cor, ano);
    }
}
