package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Color;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.FilamentoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Marca;

public class ColorDeFilamentoActualizado extends DomainEvent {

    private final Color color;
    private final FilamentoId filamentoId;
    public ColorDeFilamentoActualizado(FilamentoId filamentoId, Color color){
        super("treed.impresora.colordefilamentoactualizado");
        this.color = color;
        this.filamentoId = filamentoId;
    }

    public Color getColor() {
        return color;
    }

    public FilamentoId getFilamentoId() {
        return filamentoId;
    }
}
