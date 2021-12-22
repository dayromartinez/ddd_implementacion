package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.AreaDeTrabajo;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Capacidad;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Direccion;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.EmpleadoId;

public class EmpleadoAgregado extends DomainEvent {

    private final Nombre nombre;
    private final Apellido apellido;
    private final AreaDeTrabajo areaDeTrabajo;
    private final EmpleadoId empleadoId;

    public EmpleadoAgregado(EmpleadoId empleadoId, Nombre nombre, Apellido apellido, AreaDeTrabajo areaDeTrabajo){
        super("treed.oficina.empleadoAgregado");
        this.nombre = nombre;
        this.apellido = apellido;
        this.areaDeTrabajo = areaDeTrabajo;
        this.empleadoId = empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public AreaDeTrabajo getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
