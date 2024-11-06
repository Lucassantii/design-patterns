package br.com.designpattern.bridge.transmissoes;

import br.com.designpattern.bridge.plataformas.IPlataforma;

public class LiveAvancada extends Live {
    public LiveAvancada(IPlataforma platform) {
        super(platform);
    }

    public void subtitulos() {
        System.out.println("Legendas ativadas na transmissão.");
    }

    public void comentarios() {
        System.out.println("Comentários liberados na transmissão.");
    }
}
