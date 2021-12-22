package com.sofka.ddd.ImplementacionDDD.Impresora;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Color;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.FilamentoId;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Marca;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Metros;

import java.util.Objects;

public class Filamento extends Entity<FilamentoId> {

    private Marca marca;
    private Color color;
    private Metros metros;

    public Filamento(FilamentoId filamentoId, Marca marca, Color color, Metros metros){
        super(filamentoId);
        this.marca = marca;
        this.color = color;
        this.metros = metros;
    }

    public void actualizarMarca(Marca marca){
        this.marca = Objects.requireNonNull(marca);
    }

    public void actualizarColor(Color color){
        this.color = Objects.requireNonNull(color);
    }

    public void actualizarMetros(Metros metros){
        this.metros = Objects.requireNonNull(metros);
    }

    public Marca marca() {
        return marca;
    }

    public Color color() {
        return color;
    }

    public Metros metros() {
        return metros;
    }
}
