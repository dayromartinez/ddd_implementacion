package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.EmpleadoId;

public class ApellidoEmpleadoActualizado extends DomainEvent {

    private final Apellido apellido;
    private final EmpleadoId empleadoId;
    public ApellidoEmpleadoActualizado(EmpleadoId empleadoId, Apellido apellido){
        super("treed.oficina.apellidoempleadoactualizado");
        this.apellido = apellido;
        this.empleadoId = empleadoId;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
