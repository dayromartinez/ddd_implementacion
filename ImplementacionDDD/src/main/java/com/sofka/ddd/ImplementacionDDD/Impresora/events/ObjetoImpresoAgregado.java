package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.*;

public class ObjetoImpresoAgregado extends DomainEvent {

    private final Dimensiones dimensiones;
    private final Color color;
    private final Peso peso;
    private final Precio precio;
    private final ObjetoImpresoId objetoImpresoId;

    public ObjetoImpresoAgregado(ObjetoImpresoId objetoImpresoId, Dimensiones dimensiones, Color color, Peso peso, Precio precio){
        super("treed.impresora.objetoimpresoagregado");
        this.dimensiones = dimensiones;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
        this.objetoImpresoId = objetoImpresoId;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Color getColor() {
        return color;
    }

    public Peso getPeso() {
        return peso;
    }

    public Precio getPrecio() {
        return precio;
    }

    public ObjetoImpresoId getObjetoImpresoId() {
        return objetoImpresoId;
    }
}
