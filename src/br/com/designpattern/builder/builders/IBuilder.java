package br.com.designpattern.builder.builders;

import br.com.designpattern.builder.componentes.Cor;
import br.com.designpattern.builder.componentes.ModeloCarro;

public interface IBuilder {
    void modelo(ModeloCarro carType);
    void cor(Cor cor);
    void ano(int ano);
}
