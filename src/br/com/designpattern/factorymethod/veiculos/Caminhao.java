package br.com.designpattern.factorymethod.veiculos;

public class Caminhao implements IVeiculos{

    @Override
    public void iniciarRota() {
        carregarCarga();
        System.out.println("Iniciando a rota.");
    }

    @Override
    public void carregarCarga() {
        System.out.println("Carregamos a carga no caminhão.");
    }
}
