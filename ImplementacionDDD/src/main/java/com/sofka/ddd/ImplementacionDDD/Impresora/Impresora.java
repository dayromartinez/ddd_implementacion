package com.sofka.ddd.ImplementacionDDD.Impresora;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Estado;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.ImpresoraId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Referencia;

public class Impresora extends AggregateEvent<ImpresoraId> {

    public Impresora(ImpresoraId entityId, Referencia referencia, Dimensiones dimensiones, Estado estado) {
        super(entityId);
    }
}
