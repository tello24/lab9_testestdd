package com.lab9;

public class ServicoAutenticacao {
    private final RepositorioUsuarios repo;

    public ServicoAutenticacao(RepositorioUsuarios repo) {
        this.repo = repo;
    }

    public boolean autenticar(String nome, String senha) {
        String senhaSalva = repo.buscarSenha(nome);
        return senhaSalva != null && senhaSalva.equals(senha);
    }
}