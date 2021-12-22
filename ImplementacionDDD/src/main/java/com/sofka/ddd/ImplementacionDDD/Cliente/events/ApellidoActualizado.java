package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;

public class ApellidoActualizado extends DomainEvent {

    private final Apellido apellido;
    public ApellidoActualizado(Apellido apellido){
        super("treed.cliente.apellidoactualizado");
        this.apellido = apellido;
    }

    public Apellido getApellido() {
        return apellido;
    }
}
