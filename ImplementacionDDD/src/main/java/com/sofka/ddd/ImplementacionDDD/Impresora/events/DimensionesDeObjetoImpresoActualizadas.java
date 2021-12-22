package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.FilamentoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Metros;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.ObjetoImpresoId;

public class DimensionesDeObjetoImpresoActualizadas extends DomainEvent {

    private final Dimensiones dimensiones;
    private final ObjetoImpresoId objetoImpresoId;
    public DimensionesDeObjetoImpresoActualizadas(ObjetoImpresoId objetoImpresoId, Dimensiones dimensiones){
        super("treed.impresora.dimensionesdeobjetoimpresoactualizadas");
        this.dimensiones = dimensiones;
        this.objetoImpresoId = objetoImpresoId;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public ObjetoImpresoId getObjetoImpresoId() {
        return objetoImpresoId;
    }
}
