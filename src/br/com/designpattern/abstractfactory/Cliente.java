package br.com.designpattern.abstractfactory;

import br.com.designpattern.abstractfactory.fabricas.FabricaMoveisClassicos;
import br.com.designpattern.abstractfactory.fabricas.FabricaMoveisModernos;
import br.com.designpattern.abstractfactory.fabricas.service.FabricaDeMoveis;
import br.com.designpattern.abstractfactory.produtos.service.Mesa;
import br.com.designpattern.abstractfactory.produtos.service.Sofa;

public class Cliente {
    public static void main(String[] args) {
        FabricaDeMoveis fabricaModerna = new FabricaMoveisModernos();
        Sofa sofaModerno = fabricaModerna.criarSofa();
        Mesa mesaModerna = fabricaModerna.criarMesa();
        sofaModerno.criar();
        mesaModerna.criar();

        FabricaDeMoveis fabricaClassica = new FabricaMoveisClassicos();
        Sofa sofaClassico = fabricaClassica.criarSofa();
        Mesa mesaClassica = fabricaClassica.criarMesa();
        sofaClassico.criar();
        mesaClassica.criar();
    }
}
