package com.sofka.ddd.ImplementacionDDD.Impresora.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Celular;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Color;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.FilamentoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Marca;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Metros;

public class FilamentoAgregado extends DomainEvent {

    private final Marca marca;
    private final Color color;
    private final Metros metros;
    private final FilamentoId filamentoId;

    public FilamentoAgregado(FilamentoId filamentoId, Marca marca, Color color, Metros metros){
        super("treed.impresora.filamentoagregado");
        this.marca = marca;
        this.color = color;
        this.metros = metros;
        this.filamentoId = filamentoId;
    }

    public Marca getMarca() {
        return marca;
    }

    public Color getColor() {
        return color;
    }

    public Metros getMetros() {
        return metros;
    }

    public FilamentoId getFilamentoId() {
        return filamentoId;
    }
}
