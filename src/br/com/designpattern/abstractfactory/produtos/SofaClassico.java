package br.com.designpattern.abstractfactory.produtos;

import br.com.designpattern.abstractfactory.produtos.service.Sofa;

public class SofaClassico implements Sofa {
    @Override
    public void criar() {
        System.out.println("Criando um sofá clássico");
    }
}
