package com.laca.entity;

import com.laca.products.builder.enums.TypeProduct;

public class Products {

    private long id;
    private TypeProduct type;
    private double weight;
    private String name;
    private String description;
    private double priceUSD;
    private double height;
    private double width;

    public Products(long id, TypeProduct type, double weight, String name, String description, double priceUSD, double height, double width) {
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.name = name;
        this.description = description;
        this.priceUSD = priceUSD;
        this.height = height;
        this.width = width;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TypeProduct getType() {
        return type;
    }

    public void setType(TypeProduct type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}