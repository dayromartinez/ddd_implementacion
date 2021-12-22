package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Direccion;

public class DimensionesActualizadasOficina extends DomainEvent {

    private final Dimensiones dimensiones;
    public DimensionesActualizadasOficina(Dimensiones dimensiones){
        super("treed.oficina.dimensionesactualizadas");
        this.dimensiones = dimensiones;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }
}
