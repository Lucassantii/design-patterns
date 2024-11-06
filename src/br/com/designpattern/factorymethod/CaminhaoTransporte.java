package br.com.designpattern.factorymethod;

import br.com.designpattern.factorymethod.veiculos.Caminhao;
import br.com.designpattern.factorymethod.veiculos.IVeiculos;

public class CaminhaoTransporte extends VeiculoTransporte {
    @Override
    protected IVeiculos criarTransporte() {
        return new Caminhao();
    }
}
