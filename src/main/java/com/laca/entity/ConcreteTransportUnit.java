package com.laca.entity;

import com.laca.TransportUnit.factory.TransportType;
import com.laca.TransportUnit.factory.TransportUnit;

public class ConcreteTransportUnit implements TransportUnit {
    private long id;
    private String name;
    private String licensePlate;
    private double height;
    private double width;
    private TransportType type;
    private double maxWeight;

    public ConcreteTransportUnit() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public ConcreteTransportUnit(long id, String name, String licensePlate, double height, double width, TransportType type, double maxWeight) {
        this.id = id;
        this.name = name;
        this.licensePlate = licensePlate;
        this.height = height;
        this.width = width;
        this.type = type;
        this.maxWeight = maxWeight;
    }

    // Implementación de los métodos de la interfaz TransportUnit
    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public TransportType getType() {
        return type;
    }

    @Override
    public double getMaxWeight() {
        return maxWeight;
    }
}