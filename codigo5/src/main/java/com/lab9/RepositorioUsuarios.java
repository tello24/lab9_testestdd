package com.lab9;
import java.util.HashMap;
import java.util.Map;

public class RepositorioUsuarios {
    private final Map<String, String> usuarios = new HashMap<>();

    public void salvar(String nome, String senha) {
        usuarios.put(nome, senha);
    }

    public String buscarSenha(String nome) {
        return usuarios.get(nome);
    }
}