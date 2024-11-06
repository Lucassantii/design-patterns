package br.com.designpattern.strategy.app;

import br.com.designpattern.strategy.service.MaquininhaService;
import br.com.designpattern.strategy.service.PagamentoStrategy;
import br.com.designpattern.strategy.service.strategy.CreditoStrategy;
import br.com.designpattern.strategy.service.strategy.DebitoStrategy;
import br.com.designpattern.strategy.service.strategy.PixStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Cliente {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Qual é o método de pagamento? (PIX, CRÉDITO, DÉBITO)");
        String metodoPagamento = reader.readLine();

        System.out.println("Inisira o valor do pagamento: ");
        double valor = Double.parseDouble(reader.readLine());

        MaquininhaService pagamentoStrategy = new MaquininhaService();
        pagamentoStrategy.realizarPagamento(metodoPagamento, valor);
    }
}
