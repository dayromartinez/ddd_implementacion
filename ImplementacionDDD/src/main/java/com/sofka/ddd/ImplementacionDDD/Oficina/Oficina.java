package com.sofka.ddd.ImplementacionDDD.Oficina;
import java.util.*;
import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.Usuario;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Apellido;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.Nombre;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.UsuarioId;
import com.sofka.ddd.ImplementacionDDD.Impresora.Impresora;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.Dimensiones;
import com.sofka.ddd.ImplementacionDDD.Oficina.events.OficinaCreada;
import com.sofka.ddd.ImplementacionDDD.Oficina.values.*;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;

public class Oficina extends AggregateEvent<OficinaId> {

    protected OficinaId oficinaId;
    protected Direccion direccion;
    protected Dimensiones dimensiones;
    protected Capacidad capacidad;
    protected List<Impresora> impresoraList;
    protected List<Empleado> empleadoList;

    public Oficina(OficinaId entityId, Direccion direccion, Dimensiones dimensiones, Capacidad capacidad) {
        super(entityId);
        appendChange(new OficinaCreada(direccion, dimensiones, capacidad)).apply();
    }

    public void agregarEmpleado(EmpleadoId empleadoId, Nombre nombre, Apellido apellido, AreaDeTrabajo areaDeTrabajo){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(apellido);
        Objects.requireNonNull(areaDeTrabajo);
        appendChange(new EmpleadoAgregado(empleadoId, nombre, apellido, areaDeTrabajo)).apply();
    }

    public void actualizarDireccion(Direccion direccion){
        Objects.requireNonNull(direccion);
        appendChange(new DireccionActualizada(direccion)).apply();
    }

    public void actualizarDimensiones(Dimensiones dimensiones){
        Objects.requireNonNull(dimensiones);
        appendChange(new DimensionesActualizadas(dimensiones)).apply();
    }

    public void actualizarCapacidad(Capacidad capacidad){
        Objects.requireNonNull(capacidad);
        appendChange(new CapacidadActualizada(capacidad)).apply();
    }

    public void actualizarNombreEmpleado(EmpleadoId empleadoId, Nombre nombre){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreEmpleadoActualizado(nombre)).apply();
    }

    public void actualizarApellidoEmpleado(EmpleadoId empleadoId, Apellido apellido){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(apellido);
        appendChange(new ApellidoEmpleadoActualizado(apellido)).apply();
    }

    public void actualizarAreaDeTrabajoEmpleado(EmpleadoId empleadoId, AreaDeTrabajo areaDeTrabajo){
        Objects.requireNonNull(empleadoId);
        Objects.requireNonNull(areaDeTrabajo);
        appendChange(new AreaDeTrabajoEmpleadoActualizado(areaDeTrabajo)).apply();
    }

    public Optional<Empleado> getEmpleadoPorId(EmpleadoId empleadoId){
        Objects.requireNonNull(empleadoId);
        return empleadoList.stream()
                .filter
                        (empleado -> empleado
                                .identity()
                                .equals(empleadoId)).findFirst();
    }

    public Direccion direccion(){
        return direccion;
    }

    public Dimensiones dimensiones(){
        return dimensiones;
    }

    public Capacidad capaidad(){
        return capacidad;
    }
}
