package com.laca.TransportUnit.factory;

public abstract class    TransportUnitCreator {
    // Método factory abstracto para crear unidades de transporte
    public abstract TransportUnit createTransportUnit(long id, String name, String licensePlate, double height, double width, TransportType type, double maxWeight);
}


