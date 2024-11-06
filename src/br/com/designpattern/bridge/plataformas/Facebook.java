package br.com.designpattern.bridge.plataformas;

public class Facebook implements IPlataforma {

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada.");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação.");
    }
}
