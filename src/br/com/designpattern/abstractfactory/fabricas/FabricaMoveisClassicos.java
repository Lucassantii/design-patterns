package br.com.designpattern.abstractfactory.fabricas;

import br.com.designpattern.abstractfactory.fabricas.service.FabricaDeMoveis;
import br.com.designpattern.abstractfactory.produtos.MesaClassica;
import br.com.designpattern.abstractfactory.produtos.SofaClassico;
import br.com.designpattern.abstractfactory.produtos.service.Mesa;
import br.com.designpattern.abstractfactory.produtos.service.Sofa;

public class FabricaMoveisClassicos implements FabricaDeMoveis {
    @Override
    public Sofa criarSofa() {
        return new SofaClassico();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaClassica();
    }
}
