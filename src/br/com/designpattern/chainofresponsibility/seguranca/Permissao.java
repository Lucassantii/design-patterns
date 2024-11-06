package br.com.designpattern.chainofresponsibility.seguranca;

public abstract class Permissao {
    private Permissao permissao;

    public Permissao conectarCom(Permissao permissao) {
        this.permissao = permissao;
        return permissao;
    }

    public abstract boolean validar(String email, String password);

    protected boolean validaProximo(String email, String password) {
        if (permissao == null) {
            return true;
        }
        return permissao.validar(email, password);
    }
}
