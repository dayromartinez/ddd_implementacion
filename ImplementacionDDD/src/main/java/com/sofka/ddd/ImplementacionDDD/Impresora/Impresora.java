package com.sofka.ddd.ImplementacionDDD.Impresora;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.ImplementacionDDD.Cliente.values.ClienteId;
import com.sofka.ddd.ImplementacionDDD.Impresora.events.ImpresoraCreada;
import com.sofka.ddd.ImplementacionDDD.Impresora.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Impresora extends AggregateEvent<ImpresoraId> {

    protected ImpresoraId impresoraId;
    protected Referencia referencia;
    protected Dimensiones dimensiones;
    protected Estado estado;
    protected List<ObjetoImpreso> objetoImpresoList;
    protected List<Filamento> filamentos;

    public Impresora(ImpresoraId entityId, Referencia referencia, Dimensiones dimensiones, Estado estado) {
        super(entityId);
        appendChange(new ImpresoraCreada(referencia, dimensiones, estado)).apply();
    }

    public void agregarFilamento(FilamentoId filamentoId, Marca marca, Color color, Metros metros){
        Objects.requireNonNull(filamentoId);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(color);
        Objects.requireNonNull(metros);
        appendChange(new FilamentoAgregado(filamentoId, marca, color, metros));
    }

    public Optional<Filamento> getFilamentoPorId(ImpresoraId impresoraId){
        Objects.requireNonNull(impresoraId);
        return filamentos.stream()
                .filter
                        (impresora -> impresora
                                .identity()
                                .equals(impresoraId)).findFirst();
    }

    public void agregarObjetoImpreso(ObjetoImpresoId objetoImpresoId, Dimensiones dimensiones, Color color, Peso peso, Precio precio){
        Objects.requireNonNull(objetoImpresoId);
        Objects.requireNonNull(dimensiones);
        Objects.requireNonNull(color);
        Objects.requireNonNull(peso);
        Objects.requireNonNull(precio);
        appendChange(new ObjetoImpresoAgregado(objetoImpresoId, dimensiones, color, peso, precio));
    }

    public List<ObjetoImpreso> getObjetoImpresoPorId(ImpresoraId impresoraId){
        Objects.requireNonNull(impresoraId);
        return objetoImpresoList.stream()
                .filter
                        (impresora -> impresora
                                .identity()
                                .equals(impresoraId)).collect(Collectors.toList());
    }

    public void actualizarReferenciaImpresora(Referencia referencia){
        Objects.requireNonNull(referencia);
        appendChange(new ReferenciaActualizada(referencia)).apply();
    }

    public void actualizarDimensionesImpresora(Dimensiones dimensiones){
        Objects.requireNonNull(dimensiones);
        appendChange(new DimensionesActualizadas(dimensiones)).apply();
    }

    public void actualizarEstadoImpresora(Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new EstadoActualizado(estado)).apply();
    }

    public void actualizarMarcaFilamento(FilamentoId filamentoId, Marca marca){
        Objects.requireNonNull(filamentoId);
        Objects.requireNonNull(marca);
        appendChange(new MarcaDeFilamentoActualizada(filamentoId, marca)).apply();
    }

    public void actualizarColorFilamento(FilamentoId filamentoId, Color color){
        Objects.requireNonNull(filamentoId);
        Objects.requireNonNull(color);
        appendChange(new ColorDeFilamentoActualizado(filamentoId, color)).apply();
    }

    public void actualizarMetrosFilamento(FilamentoId filamentoId, Metros metros){
        Objects.requireNonNull(filamentoId);
        Objects.requireNonNull(metros);
        appendChange(new MetrosDeFilamentoActualizado(filamentoId, metros)).apply();
    }

    public void actualizarDimensionesObjetoImpreso(ObjetoImpresoId objetoImpresoId, Dimensiones dimensiones){
        Objects.requireNonNull(objetoImpresoId);
        Objects.requireNonNull(dimensiones);
        appendChange(new DimensionesDeObjetoImpresoActualizadas(objetoImpresoId, dimensiones)).apply();
    }

    public void actualizarColorDeObjetoImpreso(ObjetoImpresoId objetoImpresoId, Color color){
        Objects.requireNonNull(objetoImpresoId);
        Objects.requireNonNull(color);
        appendChange(new ColorDeObjetoImpresoActualizadas(objetoImpresoId, color)).apply();
    }

    public void actualizarPesoDeObjetoImpreso(ObjetoImpresoId objetoImpresoId, Peso peso){
        Objects.requireNonNull(objetoImpresoId);
        Objects.requireNonNull(peso);
        appendChange(new PesoDeObjetoImpresoActualizado(objetoImpresoId, peso)).apply();
    }

    public void actualizarPrecioDeObjetoImpreso(ObjetoImpresoId objetoImpresoId, Precio precio){
        Objects.requireNonNull(objetoImpresoId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioDeObjetoImpresoActualizadas(objetoImpresoId, precio)).apply();
    }

    public ImpresoraId impresoraId() {
        return impresoraId;
    }

    public Referencia referencia() {
        return referencia;
    }

    public Dimensiones dimensiones() {
        return dimensiones;
    }

    public Estado estado() {
        return estado;
    }
}
