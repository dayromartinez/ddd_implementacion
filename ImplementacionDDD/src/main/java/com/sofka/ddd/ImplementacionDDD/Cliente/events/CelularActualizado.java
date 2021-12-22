package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Celular;

public class CelularActualizado extends DomainEvent {

    private final Celular celular;

    public CelularActualizado(Celular celular){
        super("treed.cliente.celularactualizado");
        this.celular = celular;
    }

}
