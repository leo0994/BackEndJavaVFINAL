package com.laca.Routes.builder.clases;

public class Coordenadas {

    private Latitud latitud;
    private Longitud longitud;

    public Coordenadas(Latitud latitud, Longitud longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Latitud getLatitud() {
        return latitud;
    }

    public void setLatitud(Latitud latitud) {
        this.latitud = latitud;
    }

    public Longitud getLongitud() {
        return longitud;
    }

    public void setLongitud(Longitud longitud) {
        this.longitud = longitud;
    }
}


