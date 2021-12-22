package com.sofka.ddd.ImplementacionDDD.Oficina;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.AreaDeTrabajo;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.EmpleadoId;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoId> {

    private Nombre nombre;
    private Apellido apellido;
    private AreaDeTrabajo areaDeTrabajo;

    public Empleado(EmpleadoId empleadoId, Nombre nombre, Apellido apellido, AreaDeTrabajo areaDeTrabajo){
        super(empleadoId);
        this.nombre = nombre;
        this.apellido = apellido;
        this.areaDeTrabajo = areaDeTrabajo;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarApellido(Apellido apellido){
        this.apellido = Objects.requireNonNull(apellido);
    }

    public void actualizarAreaDeTrabajo(AreaDeTrabajo areaDeTrabajo){
        this.areaDeTrabajo = Objects.requireNonNull(areaDeTrabajo);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellido apellido() {
        return apellido;
    }

    public AreaDeTrabajo areaDeTrabajo() {
        return areaDeTrabajo;
    }
}
