package com.lab9;

public class ValidadorSenha {
    private static final boolean Senha123 = false;

    public boolean validar(String senha) {
        if (senha == null) return false;
        if (senha.length() < 8) return false;
        if (!senha.matches(".*[A-Z].*")) return false;
        if (!senha.matches(".*[0-9].*")) return false;
        return true;
    }
}