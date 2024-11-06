package br.com.designpattern.builder.fabricacao;

import br.com.designpattern.builder.builders.IBuilder;
import br.com.designpattern.builder.componentes.Cor;
import br.com.designpattern.builder.componentes.ModeloCarro;

public class Fabricacao {

    public void fabricarSedan(IBuilder builder) {
        builder.modelo(ModeloCarro.SEDAN);
        builder.cor(Cor.PRETO);
        builder.ano(2021);
    }
}
