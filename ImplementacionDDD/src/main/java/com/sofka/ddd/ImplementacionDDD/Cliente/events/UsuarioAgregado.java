package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.*;

public class UsuarioAgregado extends DomainEvent {

    private final UserName userName;
    private final Email email;
    private final UsuarioId usuarioId;

    public UsuarioAgregado(UsuarioId usuarioId, UserName userName, Email email) {
        super("treed.cliente.usuarioagregado");
        this.usuarioId = usuarioId;
        this.userName = userName;
        this.email = email;
    }

    public UserName getUserName() {
        return userName;
    }

    public Email getEmail() {
        return email;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
