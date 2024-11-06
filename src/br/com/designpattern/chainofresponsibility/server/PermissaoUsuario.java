package br.com.designpattern.chainofresponsibility.server;

import br.com.designpattern.chainofresponsibility.seguranca.Permissao;

import java.util.HashMap;
import java.util.Map;

public class PermissaoUsuario {

    private Map<String, String> users = new HashMap<>();
    private Permissao permissao;

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }

    public boolean login(String email, String password) {
        if (permissao.validar(email, password)) {
            System.out.println("Usuário autorizado com sucesso!");
            return true;
        }

        return false;
    }

    public void registrarUsuario(String email, String password) {
        users.put(email, password);
    }

    public boolean validarEmail(String email) {
        return users.containsKey(email);
    }

    public boolean validarSenha(String email, String password) {
        return users.get(email).equals(password);
    }
}
