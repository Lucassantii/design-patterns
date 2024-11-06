package br.com.designpattern.abstractfactory.produtos;

import br.com.designpattern.abstractfactory.produtos.service.Sofa;

public class SofaModerno implements Sofa {
    @Override
    public void criar() {
        System.out.println("Criando um sofá moderno");
    }
}
