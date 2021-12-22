package com.sofka.ddd.ImplementacionDDD.Oficina.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.AreaDeTrabajo;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.EmpleadoId;

public class AreaDeTrabajoEmpleadoActualizado extends DomainEvent {

    private final AreaDeTrabajo areaDeTrabajo;
    private final EmpleadoId empleadoId;
    public AreaDeTrabajoEmpleadoActualizado(EmpleadoId empleadoId, AreaDeTrabajo areaDeTrabajo){
        super("treed.oficina.areadetrabajoempleadoactualizado");
        this.areaDeTrabajo = areaDeTrabajo;
        this.empleadoId = empleadoId;
    }

    public AreaDeTrabajo getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
