package com.sofka.ddd.ImplementacionDDD.Impresora;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.*;

import java.util.Objects;

public class ObjetoImpreso extends Entity<ObjetoImpresoId> {

    private Dimensiones dimensiones;
    private Color color;
    private Peso peso;
    private Precio precio;

    public ObjetoImpreso(ObjetoImpresoId objetoImpresoId, Dimensiones dimensiones, Color color, Peso peso, Precio precio){
        super(objetoImpresoId);
        this.dimensiones = dimensiones;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
    }

    public void actualizarDimensiones(Dimensiones dimensiones){
        this.dimensiones = Objects.requireNonNull(dimensiones);
    }

    public void actualizarColor(Color color){
        this.color = Objects.requireNonNull(color);
    }

    public void actualizarPeso(Peso peso){
        this.peso = Objects.requireNonNull(peso);
    }

    public void actualizarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public Dimensiones dimensiones() {
        return dimensiones;
    }

    public Color color() {
        return color;
    }

    public Peso peso() {
        return peso;
    }

    public Precio precio() {
        return precio;
    }
}
