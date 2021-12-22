package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Color;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.FilamentoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Metros;

public class MetrosDeFilamentoActualizado extends DomainEvent {

    private final Metros metros;
    private final FilamentoId filamentoId;
    public MetrosDeFilamentoActualizado(FilamentoId filamentoId, Metros metros){
        super("treed.impresora.metrosdefilamentoactualizado");
        this.metros = metros;
        this.filamentoId = filamentoId;
    }

    public Metros getMetros() {
        return metros;
    }

    public FilamentoId getFilamentoId() {
        return filamentoId;
    }
}
