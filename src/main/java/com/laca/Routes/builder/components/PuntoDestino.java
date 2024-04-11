package com.laca.Routes.builder.components;

import com.laca.Routes.builder.clases.Coordenadas;

public class PuntoDestino {

    private Coordenadas coordenadas;

    public PuntoDestino(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

}

