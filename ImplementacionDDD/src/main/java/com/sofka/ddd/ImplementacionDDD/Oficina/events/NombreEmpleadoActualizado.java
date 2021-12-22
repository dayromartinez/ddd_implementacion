package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.Capacidad;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.EmpleadoId;

public class NombreEmpleadoActualizado extends DomainEvent {

    private final Nombre nombre;
    private final EmpleadoId empleadoId;
    public NombreEmpleadoActualizado(EmpleadoId empleadoId, Nombre nombre){
        super("treed.oficina.nombreempleadoactualizado");
        this.nombre = nombre;
        this.empleadoId = empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
