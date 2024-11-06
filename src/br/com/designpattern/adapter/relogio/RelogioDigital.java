package br.com.designpattern.adapter.relogio;

public class RelogioDigital implements Relogio{
    private String hora;

    public RelogioDigital(String hora) {
        this.hora = hora;
    }

    @Override
    public String exibirHora() {
        return "Relógio Digital - Hora atual: " + hora;
    }
}
