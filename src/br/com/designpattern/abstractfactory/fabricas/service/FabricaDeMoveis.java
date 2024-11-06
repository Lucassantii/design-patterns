package br.com.designpattern.abstractfactory.fabricas.service;

import br.com.designpattern.abstractfactory.produtos.service.Mesa;
import br.com.designpattern.abstractfactory.produtos.service.Sofa;

public interface FabricaDeMoveis {
    Sofa criarSofa();
    Mesa criarMesa();
}
