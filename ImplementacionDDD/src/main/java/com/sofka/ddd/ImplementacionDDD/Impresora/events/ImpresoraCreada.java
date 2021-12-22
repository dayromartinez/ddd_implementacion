package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Estado;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Referencia;

public class ImpresoraCreada extends DomainEvent {

    private final Referencia referencia;
    private final Dimensiones dimensiones;
    private final Estado estado;

    public ImpresoraCreada(Referencia referencia, Dimensiones dimensiones, Estado estado) {
        super("treed.impresora.impresoracreada");
        this.referencia = referencia;
        this.dimensiones = dimensiones;
        this.estado = estado;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Estado getEstado() {
        return estado;
    }
}
