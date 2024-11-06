package br.com.designpattern.abstractfactory.fabricas;

import br.com.designpattern.abstractfactory.fabricas.service.FabricaDeMoveis;
import br.com.designpattern.abstractfactory.produtos.MesaModerna;
import br.com.designpattern.abstractfactory.produtos.SofaModerno;
import br.com.designpattern.abstractfactory.produtos.service.Mesa;
import br.com.designpattern.abstractfactory.produtos.service.Sofa;

public class FabricaMoveisModernos implements FabricaDeMoveis {
    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }

    @Override
    public Mesa criarMesa() {
        return new MesaModerna();
    }
}
