package br.com.designpattern.bridge.transmissoes;

import br.com.designpattern.bridge.plataformas.IPlataforma;

public class GravacaoLive extends Live {
    public GravacaoLive(IPlataforma platform) {
        super(platform);
    }

    public void gravar() {
        System.out.println("Transmissão gravada.");
    }
}
