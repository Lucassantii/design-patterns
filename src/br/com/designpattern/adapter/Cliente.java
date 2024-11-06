package br.com.designpattern.adapter;

import br.com.designpattern.adapter.adapters.AdaptadorRelogio;
import br.com.designpattern.adapter.relogio.Relogio;
import br.com.designpattern.adapter.relogio.RelogioCalendario;
import br.com.designpattern.adapter.relogio.RelogioDigital;

public class Cliente {
    public static void main(String[] args) {
        RelogioCalendario sistemaCalendario = new RelogioCalendario();
        RelogioDigital relogioDigital = new RelogioDigital("14:30:00");

        System.out.println(relogioDigital.exibirHora());

        Relogio relogioAdaptado = new AdaptadorRelogio(sistemaCalendario, relogioDigital);
        System.out.println(relogioAdaptado.exibirHora());
    }
}
