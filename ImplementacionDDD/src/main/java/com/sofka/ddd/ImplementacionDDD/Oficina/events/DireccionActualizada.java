package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.ObjetoImpresoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Precio;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Direccion;

public class DireccionActualizada extends DomainEvent {

    private final Direccion direccion;
    public DireccionActualizada(Direccion direccion){
        super("treed.oficina.direccionactualizada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
