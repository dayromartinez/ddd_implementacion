package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Estado;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.FilamentoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Marca;

public class MarcaDeFilamentoActualizada extends DomainEvent {

    private final Marca marca;
    private final FilamentoId filamentoId;
    public MarcaDeFilamentoActualizada(FilamentoId filamentoId, Marca marca){
        super("treed.impresora.marcadefilamentoactualizada");
        this.marca = marca;
        this.filamentoId = filamentoId;
    }

    public Marca getMarca() {
        return marca;
    }

    public FilamentoId getFilamentoId() {
        return filamentoId;
    }
}
