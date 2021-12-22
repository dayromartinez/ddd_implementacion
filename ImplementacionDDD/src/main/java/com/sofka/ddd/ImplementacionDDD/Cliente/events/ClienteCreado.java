package com.sofka.ddd.ImplementacionDDD.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Celular;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;

public class ClienteCreado extends DomainEvent {

    private final Nombre nombre;
    private final Apellido apellido;
    private final Celular celular;

    public ClienteCreado(Nombre nombre, Apellido apellido, Celular celular){
        super("treed.cliente.clientecreado");
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
}
