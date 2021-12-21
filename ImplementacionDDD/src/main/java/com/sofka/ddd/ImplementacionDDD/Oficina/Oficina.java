package com.sofka.ddd.ImplementacionDDD.Oficina;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Capacidad;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Direccion;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.OficinaId;

public class Oficina extends AggregateEvent<OficinaId> {
    public Oficina(OficinaId entityId, Direccion direccion, Dimensiones dimensiones, Capacidad capacidad) {
        super(entityId);
    }
}
