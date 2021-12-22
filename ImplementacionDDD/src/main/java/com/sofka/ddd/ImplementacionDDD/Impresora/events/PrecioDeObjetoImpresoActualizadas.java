package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.ObjetoImpresoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Peso;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Precio;

public class PrecioDeObjetoImpresoActualizadas extends DomainEvent {

    private final Precio precio;
    private final ObjetoImpresoId objetoImpresoId;
    public PrecioDeObjetoImpresoActualizadas(ObjetoImpresoId objetoImpresoId, Precio precio){
        super("treed.impresora.pesodeobjetoimpresoactualizado");
        this.precio = precio;
        this.objetoImpresoId = objetoImpresoId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public ObjetoImpresoId getObjetoImpresoId() {
        return objetoImpresoId;
    }
}
