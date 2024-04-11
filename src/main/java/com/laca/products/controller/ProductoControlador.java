package com.laca.products.controller;

import com.laca.entity.Products;
import com.laca.products.service.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @Autowired
    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping
    public List<Products> getAllProductos() {
        return productoServicio.getAllProductos();
    }

    @PostMapping
    public Products saveProduct(@RequestBody Products newProduct) {
        return productoServicio.saveProduct(newProduct);
    }

}


