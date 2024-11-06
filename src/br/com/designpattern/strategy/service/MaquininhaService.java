package br.com.designpattern.strategy.service;

import br.com.designpattern.strategy.service.strategy.CreditoStrategy;
import br.com.designpattern.strategy.service.strategy.DebitoStrategy;
import br.com.designpattern.strategy.service.strategy.PixStrategy;

import java.util.Map;

public class MaquininhaService {
    public final Map<String, PagamentoStrategy> pagamentos = Map.of(
            "PIX", new PixStrategy(),
            "CRÉDITO", new CreditoStrategy(),
            "DÉBITO", new DebitoStrategy()
    );

    public void realizarPagamento(String metodoPagamento, double valor) {
        System.out.println("Iniciando pagamento de R$ " + valor + " no método " + metodoPagamento);
        pagamentos.get(metodoPagamento).pagar(valor);
    }
}
