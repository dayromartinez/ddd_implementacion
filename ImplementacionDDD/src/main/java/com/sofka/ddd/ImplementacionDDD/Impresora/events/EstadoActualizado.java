package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Estado;

public class EstadoActualizado extends DomainEvent {

    private final Estado estado;
    public EstadoActualizado(Estado estado){
        super("treed.impresora.estadoactualizado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
