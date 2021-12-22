package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.UserName;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.UsuarioId;

public class UsernameDeUsuarioActualizado extends DomainEvent {

    private final UserName username;
    private final UsuarioId usuarioId;


    public UsernameDeUsuarioActualizado(UsuarioId usuarioId, UserName username) {
        super("treed.cliente.usernamedeusuarioactualizado");
        this.usuarioId = usuarioId;
        this.username = username;
    }

    public UserName getUsername() {
        return username;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
