package br.com.designpattern.strategy.service.strategy;

import br.com.designpattern.strategy.service.PagamentoStrategy;

public class PixStrategy implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso no PIX.");
    }
}
