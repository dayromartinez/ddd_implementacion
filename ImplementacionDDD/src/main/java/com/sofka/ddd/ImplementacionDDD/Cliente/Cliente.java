package com.sofka.ddd.ImplementacionDDD.Cliente;

import java.util.*;
import java.util.stream.Collectors;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.events.*;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.*;
import com.sofka.ddd.ImplementacionDDD.Impresora.ObjetoImpreso;


public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected Apellido apellido;
    protected Celular celular;
    protected List<Usuario> usuarios;
    protected List<ObjetoImpreso> objetoImpresoList;
    protected ClienteId clienteId;

    public Cliente(ClienteId entityId, Nombre nombre, Apellido apellido, Celular celular) {
        super(entityId);
        appendChange(new ClienteCreado(nombre, apellido, celular)).apply();
    }

    public void agregarUsuario(UsuarioId usuarioId, UserName userName, Email email){
        Objects.requireNonNull(usuarioId);
        Objects.requireNonNull(userName);
        Objects.requireNonNull(email);
        appendChange(new UsuarioAgregado(usuarioId, userName, email)).apply();
    }

    public void actualizarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public void actualizarApellido(Apellido apellido){
        Objects.requireNonNull(apellido);
        appendChange(new ApellidoActualizado(apellido)).apply();
    }

    public void actualizarCelular(Celular celular){
        Objects.requireNonNull(celular);
        appendChange(new CelularActualizado(celular)).apply();
    }

    public Optional<Usuario> getUsuarioPorId(UsuarioId usuarioId){
            Objects.requireNonNull(usuarioId);
            return usuarios.stream()
                    .filter
                            (usuario -> usuario
                                    .identity()
                                    .equals(usuarioId)).findFirst();
    }

    public List<ObjetoImpreso> getListObjetosImpresosPorClienteId(ClienteId clienteId){
        Objects.requireNonNull(clienteId);
        return objetoImpresoList.stream()
                .filter(cliente -> cliente
                        .identity()
                        .equals(clienteId))
                .collect(Collectors.toList());
    }

    public void actualizarUsernameUsuario(UsuarioId usuarioId, UserName userName){
        Objects.requireNonNull(userName);
        Objects.requireNonNull(usuarioId);
        appendChange(new UsernameDeUsuarioActualizado(usuarioId, userName)).apply();
    }

    public void actualizarEmailUsuario(UsuarioId usuarioId, Email email){
        Objects.requireNonNull(usuarioId);
        Objects.requireNonNull(email);
        appendChange(new EmailDeUsuarioActualizado(usuarioId, email)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellido apellido() {
        return apellido;
    }

    public Celular celular() {
        return celular;
    }

    public ClienteId clienteId(){
        return clienteId;
    }
}