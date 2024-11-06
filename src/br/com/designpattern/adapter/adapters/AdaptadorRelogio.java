package br.com.designpattern.adapter.adapters;

import br.com.designpattern.adapter.relogio.Relogio;
import br.com.designpattern.adapter.relogio.RelogioCalendario;
import br.com.designpattern.adapter.relogio.RelogioDigital;

public class AdaptadorRelogio implements Relogio {
    private RelogioCalendario sistemaCalendario;
    private RelogioDigital sistemaDigital;

    public AdaptadorRelogio(RelogioCalendario sistemaCalendario, RelogioDigital sistemaDigital) {
        this.sistemaCalendario = sistemaCalendario;
        this.sistemaDigital = sistemaDigital;
    }

    @Override
    public String exibirHora() {
        String horaAtual = sistemaDigital.exibirHora();
        String dataAtual = sistemaCalendario.obterData();

        return horaAtual + ", Data atual: " + dataAtual;
    }
}
