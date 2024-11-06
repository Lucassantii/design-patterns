package br.com.designpattern.bridge.transmissoes;

import br.com.designpattern.bridge.plataformas.IPlataforma;

public class Live implements ITransmissao {
    protected IPlataforma platform;

    public Live(){
    }

    public Live(IPlataforma platform){
        this.platform = platform;
    }

    @Override
    public void programacao() {
        System.out.println("Iniciando a Transmissão");
    }

    @Override
    public void resultado() {
        System.out.println("*** Ao Vivo ***");
    }
}
