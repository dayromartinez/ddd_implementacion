package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;

public class NombreActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreActualizado(Nombre nombre){
        super("treed.cliente.nombreactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
