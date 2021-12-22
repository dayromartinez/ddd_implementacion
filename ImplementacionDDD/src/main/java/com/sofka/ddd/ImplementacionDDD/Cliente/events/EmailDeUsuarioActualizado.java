package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Email;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.UsuarioId;

public class EmailDeUsuarioActualizado extends DomainEvent {

    private final Email email;
    private final UsuarioId usuarioId;


    public EmailDeUsuarioActualizado(UsuarioId usuarioId, Email email) {
        super("treed.cliente.emaildeusuarioactualizado");
        this.usuarioId = usuarioId;
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
