package com.laca.TransportUnit.factory;


public interface TransportUnit {
        // Métodos comunes para una unidad de transporte
        long getId();
        String getName();
        String getLicensePlate();
        double getHeight();
        double getWidth();
        TransportType getType();
        double getMaxWeight();
}

