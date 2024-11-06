package br.com.designpattern.bridge.plataformas;

public class Youtube implements IPlataforma {

    public Youtube() {
        configureRMTP();
        System.out.println("Youtube: Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Configurando broadcasting.");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação.");
    }
}
