package com.murilo.builder;

import com.murilo.domain.Usuario;

public class UsuarioBuilder {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private UsuarioBuilder() {}

    public Usuario agora() {
        return new Usuario(id, nome, email, senha);
    }

    public static UsuarioBuilder umUsuario() {
        UsuarioBuilder u = new UsuarioBuilder();
        inicializarDadosPadroes(u);
        return u;
    }

    public static void inicializarDadosPadroes(UsuarioBuilder u) {
        u.id = 1L;
        u.nome = "murilo";
        u.email = "murilo@teste.com";
        u.senha = "123456";
    }

    public UsuarioBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public UsuarioBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder comEmail(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder comSenha(String senha) {
        this.senha = senha;
        return this;
    }
}
