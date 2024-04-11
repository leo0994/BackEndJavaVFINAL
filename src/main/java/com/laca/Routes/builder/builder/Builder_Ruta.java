package com.laca.Routes.builder.builder;

import com.laca.Routes.builder.clases.Coordenadas;
import com.laca.Routes.builder.components.PuntoDestino;
import com.laca.Routes.builder.components.PuntoOrigen;
import com.laca.Routes.builder.enums.TipoRuta;
import com.laca.entity.Ruta;

public class Builder_Ruta implements IBuilder_Ruta {

    private Long id;
    private String nombre;
    private String descripcion;
    private String origenLatitud;
    private String origenLongitud;
    private String destinoLatitud;
    private String destinoLongitud;


    private double costoRuta;


    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public void setOrigenLatitud(String origenLatitud) {
        this.origenLatitud = origenLatitud;
    }
    @Override
    public void setOrigenLongitud(String origenLongitud) {
        this.origenLongitud = origenLongitud;
    }
    @Override
    public void setDestinoLatitud(String destinoLatitud) {
        this.destinoLatitud = destinoLatitud;
    }
    @Override
    public void setDestinoLongitud(String destinoLongitud) {
        this.destinoLongitud = destinoLongitud;
    }

    @Override
    public void setCostoRuta(double costoRuta) {
        this.costoRuta = costoRuta;
    }

    @Override
    public Ruta getRuta() {
        // Suponiendo que tienes definidos los objetos necesarios: tipoRuta, puntoPartida, puntoDeLlegada
        return new Ruta(id, nombre, descripcion, origenLatitud, origenLongitud, destinoLatitud, destinoLongitud, costoRuta);
    }

}