package br.com.designpattern.factorymethod;

import br.com.designpattern.factorymethod.veiculos.IVeiculos;

public abstract class VeiculoTransporte {

    void iniciarTransporte() {
        IVeiculos veiculos = criarTransporte();
        veiculos.iniciarRota();
    }

    protected abstract IVeiculos criarTransporte();
}
