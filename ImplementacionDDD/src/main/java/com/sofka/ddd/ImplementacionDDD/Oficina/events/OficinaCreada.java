package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Capacidad;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Direccion;

public class OficinaCreada extends DomainEvent {

    private final Direccion direccion;
    private final Dimensiones dimensiones;
    private final Capacidad capacidad;

    public OficinaCreada(Direccion direccion, Dimensiones dimensiones, Capacidad capacidad){
        super("treed.oficina.oficinacreada");
        this.direccion = direccion;
        this.dimensiones = dimensiones;
        this.capacidad = capacidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
