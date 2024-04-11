package com.laca.products.builder.director;

import com.laca.Routes.builder.builder.IBuilder_Ruta;
import com.laca.Routes.builder.director.RutaBuilderDirector;
import com.laca.products.builder.builder.IBuilder_Products;
import com.laca.products.builder.enums.TypeProduct;

public class ProductsBuilderDirector {
    private static final ProductsBuilderDirector instance = new ProductsBuilderDirector();

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private ProductsBuilderDirector() {}

    // Método estático para obtener la instancia única del creador
    public static ProductsBuilderDirector getInstance() {
        return instance;
    }
    public void buildProduct(IBuilder_Products builder, long id, TypeProduct type, double weight, String name,
                             String description, double priceUSB, double height, double width) {
        builder.setId(id);
        builder.setType(type);
        builder.setWeight(weight);
        builder.setName(name);
        builder.setDescription(description);
        builder.setPriceUSD(priceUSB);
        builder.setHeight(height);
        builder.setWidth(width);
    }


}
