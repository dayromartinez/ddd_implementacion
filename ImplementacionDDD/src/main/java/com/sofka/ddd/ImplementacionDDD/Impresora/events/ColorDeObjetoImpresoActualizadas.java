package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Color;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.ObjetoImpresoId;

public class ColorDeObjetoImpresoActualizadas extends DomainEvent {

    private final Color color;
    private final ObjetoImpresoId objetoImpresoId;
    public ColorDeObjetoImpresoActualizadas(ObjetoImpresoId objetoImpresoId, Color color){
        super("treed.impresora.colordeobjetoimpresoactualizado");
        this.color = color;
        this.objetoImpresoId = objetoImpresoId;
    }

    public Color getColor() {
        return color;
    }

    public ObjetoImpresoId getObjetoImpresoId() {
        return objetoImpresoId;
    }
}
