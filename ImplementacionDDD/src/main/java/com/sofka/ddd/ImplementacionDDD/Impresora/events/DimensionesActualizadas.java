package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Referencia;

public class DimensionesActualizadas extends DomainEvent {

    private final Dimensiones dimensiones;
    public DimensionesActualizadas(Dimensiones dimensiones){
        super("treed.impresora.dimensionesactualizadas");
        this.dimensiones = dimensiones;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }
}
