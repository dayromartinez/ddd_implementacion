package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Color;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.ObjetoImpresoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Peso;

public class PesoDeObjetoImpresoActualizado extends DomainEvent {

    private final Peso peso;
    private final ObjetoImpresoId objetoImpresoId;
    public PesoDeObjetoImpresoActualizado(ObjetoImpresoId objetoImpresoId, Peso peso){
        super("treed.impresora.pesodeobjetoimpresoactualizado");
        this.peso = peso;
        this.objetoImpresoId = objetoImpresoId;
    }

    public Peso getPeso() {
        return peso;
    }

    public ObjetoImpresoId getObjetoImpresoId() {
        return objetoImpresoId;
    }
}
