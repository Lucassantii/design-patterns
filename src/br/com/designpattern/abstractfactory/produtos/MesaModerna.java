package br.com.designpattern.abstractfactory.produtos;

import br.com.designpattern.abstractfactory.produtos.service.Mesa;

public class MesaModerna implements Mesa {
    @Override
    public void criar() {
        System.out.println("Criando mesa moderna");
    }
}
