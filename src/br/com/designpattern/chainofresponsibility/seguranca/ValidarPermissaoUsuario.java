package br.com.designpattern.chainofresponsibility.seguranca;

import br.com.designpattern.chainofresponsibility.server.PermissaoUsuario;

public class ValidarPermissaoUsuario extends Permissao {
    private PermissaoUsuario permissaoUsuario;

    public ValidarPermissaoUsuario(PermissaoUsuario permissaoUsuario) {
        this.permissaoUsuario = permissaoUsuario;
    }

    @Override
    public boolean validar(String email, String password) {
        if (!permissaoUsuario.validarEmail(email)) {
            System.out.println("Email inválido.");
            return false;
        }
        if (!permissaoUsuario.validarSenha(email, password)) {
            System.out.println("Email ou Senha inválidos.");
            return false;
        }
        return validaProximo(email, password);
    }
}
