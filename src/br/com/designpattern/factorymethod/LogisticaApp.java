package br.com.designpattern.factorymethod;

public class LogisticaApp {

    public static void main(String[] args) {
        VeiculoTransporte logistica = new NavioTransporte();
        logistica.iniciarTransporte();

        logistica = new CaminhaoTransporte();
        logistica.iniciarTransporte();
    }
}
