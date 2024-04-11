package com.laca.products.builder.builder;

import com.laca.entity.Products;
import com.laca.entity.Ruta;
import com.laca.products.builder.enums.TypeProduct;

public class Builder_Products implements IBuilder_Products{

    private long id;
    private TypeProduct type;
    private double weight;
    private String name;
    private String description;
    private double priceUSD;
    private double height;
    private double width;

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void setType(TypeProduct type) {
        this.type = type;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setPriceUSD(double priceUSD) {
        this.priceUSD = priceUSD;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public Products getProducts() {
        return new Products(id, type, weight, name, description, priceUSD, height, width);
    }
}
