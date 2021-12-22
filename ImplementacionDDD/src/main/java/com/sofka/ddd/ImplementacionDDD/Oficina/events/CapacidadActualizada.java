package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Capacidad;

public class CapacidadActualizada extends DomainEvent {

    private final Capacidad capacidad;
    public CapacidadActualizada(Capacidad capacidad){
        super("treed.oficina.capacidadactualizada");
        this.capacidad = capacidad;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
