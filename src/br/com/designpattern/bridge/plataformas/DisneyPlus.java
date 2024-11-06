package br.com.designpattern.bridge.plataformas;

public class DisneyPlus implements IPlataforma {

    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Configurando servidor RMTP.");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação.");
    }
}
