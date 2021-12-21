package com.sofka.ddd.ImplementacionDDD.Cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Celular;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.ClienteId;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;

public class Cliente extends AggregateEvent<ClienteId> {

    public Cliente(ClienteId entityId, Nombre nombre, Apellido apellido, Celular celular) {
        super(entityId);
    }
}
