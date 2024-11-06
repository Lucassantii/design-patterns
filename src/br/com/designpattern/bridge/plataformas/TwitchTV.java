package br.com.designpattern.bridge.plataformas;

public class TwitchTV implements IPlataforma {

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurando RMTP.");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal.");
    }
}
