package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Referencia;

public class ReferenciaActualizada extends DomainEvent {

    private final Referencia referencia;
    public ReferenciaActualizada(Referencia referencia){
        super("treed.impresora.referenciaactualizada");
        this.referencia = referencia;
    }

}
