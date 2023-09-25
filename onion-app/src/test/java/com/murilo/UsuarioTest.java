package com.murilo;

import com.murilo.builder.UsuarioBuilder;
import com.murilo.domain.Usuario;
import com.murilo.exception.ValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.murilo.builder.UsuarioBuilder.umUsuario;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest  {

    @Test
    public void deveCriarUsuarioValido() {
        Usuario usuario = new Usuario(1L,"Murilo","email@email.com","123456");
        System.out.println(usuario);
        assertEquals(1L,usuario.getId());
        assertEquals("Murilo", usuario.getNome());
        assertEquals("email@email.com", usuario.getEmail());
        assertEquals("123456", usuario.getSenha());
    }

    @Test
    public void deveCriarUsuarioValidoBuilder() {
        Usuario usuario = umUsuario().agora();
        System.out.println(usuario);
        assertEquals(1L, usuario.getId() );
        assertEquals("murilo", usuario.getNome());
        assertEquals("murilo@teste.com", usuario.getEmail());
        assertEquals("123456", usuario.getSenha());
    }

    @Test
    public void validaValidationExcetion() {
        Assertions.assertThrows(ValidationException.class, () ->
                new Usuario(1L,null,"teste.com",null));
    }

    @Test
    public void deveGerarValidationExceptionAoCriarUsuario() {
        try {
            Usuario usuario = new Usuario(1L,"","XXXXXXXXXXXXXXX","123");
        } catch (ValidationException e) {
            assertEquals("nome é obrigatorio", e.getMessage());
        }
    }


    @Test
    public void deveGerarExcecaoAoCriarUsuarioInvalido() {
        try {
            Usuario usuario = new Usuario(1L,"Murilo","XXXXXXXXXXXXXXX","123");
        } catch (IllegalArgumentException e) {
            assertEquals("Senha deve ter no minimo 6 caracteres", e.getMessage());
        }
    }
}
