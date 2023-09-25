package com.murilo.domain;

import com.murilo.exception.ValidationException;

public class Usuario {

    public Usuario(Long id, String nome, String email, String senha) {

        if(nome == null) {
            throw new ValidationException("nome é obrigatorio");
        }

        if(email == null) {
            throw new ValidationException("email é obrigatorio");
        }

        if(senha == null) {
            throw new ValidationException("senha é obrigatorio");
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

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
