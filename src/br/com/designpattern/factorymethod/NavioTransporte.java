package br.com.designpattern.factorymethod;

import br.com.designpattern.factorymethod.veiculos.IVeiculos;
import br.com.designpattern.factorymethod.veiculos.Navio;

public class NavioTransporte extends VeiculoTransporte {
    @Override
    protected IVeiculos criarTransporte() {
        return new Navio();
    }
}
