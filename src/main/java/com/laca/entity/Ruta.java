package com.laca.entity;

public class Ruta {
    private Long id;
    private String nombre;
    private  String descripcion;
    private String origenLatitud;
    private String origenLongitud;
    private String destinoLatitud;
    private String destinoLongitud;
    private double costoRuta;


    public Ruta(Long id, String nombre, String descripcion, String origenLatitud, String origenLongitud, String destinoLatitud, String destinoLongitud, double costoRuta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origenLatitud = origenLatitud;
        this.origenLongitud = origenLongitud;
        this.destinoLatitud = destinoLatitud;
        this.destinoLongitud = destinoLongitud;
        this.costoRuta = costoRuta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrigenLatitud() {
        return origenLatitud;
    }

    public void setOrigenLatitud(String origenLatitud) {
        this.origenLatitud = origenLatitud;
    }

    public String getOrigenLongitud() {
        return origenLongitud;
    }

    public void setOrigenLongitud(String origenLongitud) {
        this.origenLongitud = origenLongitud;
    }

    public String getDestinoLatitud() {
        return destinoLatitud;
    }

    public void setDestinoLatitud(String destinoLatitud) {
        this.destinoLatitud = destinoLatitud;
    }

    public String getDestinoLongitud() {
        return destinoLongitud;
    }

    public void setDestinoLongitud(String destinoLongitud) {
        this.destinoLongitud = destinoLongitud;
    }

    public double getCostoRuta() {
        return costoRuta;
    }

    public void setCostoRuta(double costoRuta) {
        this.costoRuta = costoRuta;
    }
}


