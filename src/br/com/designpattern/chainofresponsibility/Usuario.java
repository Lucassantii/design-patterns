package br.com.designpattern.chainofresponsibility;

import br.com.designpattern.chainofresponsibility.seguranca.Permissao;
import br.com.designpattern.chainofresponsibility.seguranca.ValidandoPermissao;
import br.com.designpattern.chainofresponsibility.seguranca.ValidarPermissaoUsuario;
import br.com.designpattern.chainofresponsibility.server.PermissaoUsuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Usuario {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static PermissaoUsuario permissaoUsuario;

    public static void entrar(){
        permissaoUsuario = new PermissaoUsuario();
        permissaoUsuario.registrarUsuario("master@hcode.com.br", "1a2s3d4f5fteste");
        permissaoUsuario.registrarUsuario("user.com.br", "12345");

        Permissao permissao = new ValidarPermissaoUsuario(permissaoUsuario);
        permissao.conectarCom(new ValidandoPermissao());

        permissaoUsuario.setPermissao(permissao);
    }

    public static void main(String[] args) throws IOException {
        entrar();

        boolean concluir;

        do {
            System.out.println("Digite o email: ");
            String email = reader.readLine();
            System.out.println("Digite a senha: ");
            String password = reader.readLine();

            concluir = permissaoUsuario.login(email, password);
        } while (!concluir);
    }
}