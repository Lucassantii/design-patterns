package br.com.designpattern.bridge;

import br.com.designpattern.bridge.plataformas.*;
import br.com.designpattern.bridge.transmissoes.LiveAvancada;
import br.com.designpattern.bridge.transmissoes.Live;
import br.com.designpattern.bridge.transmissoes.GravacaoLive;

public class Cliente {
    public static void main(String[] args) {
        startLive(new DisneyPlus());
        startLive(new Youtube());
        startLive(new Facebook());
        startLive(new TwitchTV());
    }

    public static void startLive(IPlataforma platform) {
/*        System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.programacao();
        live.resultado();*/

/*        System.out.println("Transmissão avançada...Aguarde!");
        LiveAvancada liveAvancada = new LiveAvancada(platform);
        liveAvancada.programacao();
        liveAvancada.subtitulos();
        liveAvancada.comentarios();
        liveAvancada.resultado();*/

        System.out.println("Transmissão gravada...Aguarde!");
        GravacaoLive gravacaoLive = new GravacaoLive(platform);
        gravacaoLive.programacao();
        gravacaoLive.gravar();
        gravacaoLive.resultado();
    }
}