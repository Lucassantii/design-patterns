package br.com.designpattern.factorymethod.veiculos;

public class Navio implements IVeiculos{

    @Override
    public void iniciarRota() {
        carregarCarga();
        System.out.println("Iniciando a rota de navegação.");
    }

    @Override
    public void carregarCarga() {
        System.out.println("Carregamos a carga no navio.");
    }
}
