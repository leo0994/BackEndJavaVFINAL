package com.laca.Routes.builder.utilidades;

import com.laca.Routes.builder.clases.Coordenadas;

public class UtilidadesGeograficas {

    private static final int RADIO_TIERRA = 6371;

    public static double calcularDistancia(Coordenadas origen, Coordenadas destino) {
        double latitudOrigen = Math.toRadians(origen.getLatitud().getValor());
        double longitudOrigen = Math.toRadians(origen.getLongitud().getValor());
        double latitudDestino = Math.toRadians(destino.getLatitud().getValor());
        double longitudDestino = Math.toRadians(destino.getLongitud().getValor());

        double difLatitud = latitudDestino - latitudOrigen;
        double difLongitud = longitudDestino - longitudOrigen;

        double a = Math.pow(Math.sin(difLatitud / 2), 2) +
                Math.cos(latitudOrigen) * Math.cos(latitudDestino) *
                        Math.pow(Math.sin(difLongitud / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distancia = RADIO_TIERRA * c;

        return distancia;
    }
}
