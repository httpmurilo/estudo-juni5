package com.murilo.domain;

import com.murilo.exception.ValidationException;

public class Usuario {

    public Usuario(Long id, String nome, String email, String senha) {

        if(nome == null) {
            throw new ValidationException("o nome é obrigatorio");
        }

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    private Long id;
    private String nome;
    private String email;
    private String senha;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
