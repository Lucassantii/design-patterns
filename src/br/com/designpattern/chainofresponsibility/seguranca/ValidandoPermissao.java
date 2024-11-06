package br.com.designpattern.chainofresponsibility.seguranca;

public class ValidandoPermissao extends Permissao {

    @Override
    public boolean validar(String email, String password) {
        if (email.equals("master@hcode.com.br")) {
            System.out.println("Bem vindo administrador!");
            return true;
        }
        System.out.println("Bem vindo!");
        return validaProximo(email, password);
    }
}
