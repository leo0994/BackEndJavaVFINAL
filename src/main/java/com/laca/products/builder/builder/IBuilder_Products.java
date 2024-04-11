package com.laca.products.builder.builder;

import com.laca.entity.Products;
import com.laca.products.builder.enums.TypeProduct;

public interface IBuilder_Products {

    void setId(long id);
    void setType(TypeProduct type);
    void setWeight(double weight);
    void setName(String name);
    void setDescription(String description);
    void setPriceUSD(double priceUSD);
    void setHeight(double height);
    void setWidth(double width);

    Products getProducts();
}
