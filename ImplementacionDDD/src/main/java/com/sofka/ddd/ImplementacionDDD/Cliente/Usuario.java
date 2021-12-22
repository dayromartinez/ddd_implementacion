package com.sofka.ddd.ImplementacionDDD.Cliente;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Email;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.UserName;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.UsuarioId;

import java.util.Objects;

public class Usuario extends Entity<UsuarioId> {

    private UserName userName;
    private Email email;

    public Usuario(UsuarioId usuarioId, UserName userName, Email email){
        super(usuarioId);
        this.userName = userName;
        this.email = email;
    }

    public void actualizarUsername(UserName userName){
        this.userName = Objects.requireNonNull(userName);
    }

    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public UserName userName() {
        return userName;
    }

    public Email email() {
        return email;
    }
}
