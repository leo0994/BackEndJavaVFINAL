package com.laca.products.service;

import com.laca.connectDB.ConnectDB;
import com.laca.entity.Products;
import com.laca.products.builder.enums.TypeProduct;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Service// no olvidar aplicar esto
public class ProductoServicio {
    public List<Products> getAllProductos() {
        List<Products> products = new ArrayList<>();
        try (Connection connection = ConnectDB.getInstance().getConnection()) {
            String query = "SELECT * FROM products";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    long id = resultSet.getLong("id");
                    String typeString = resultSet.getString("type");
                    TypeProduct type = TypeProduct.valueOf(typeString);
                    double weight = resultSet.getDouble("weight");
                    String name = resultSet.getString("name");
                    String description = resultSet.getString("description");
                    double priceUSD = resultSet.getDouble("price_usd");
                    double height = resultSet.getDouble("height");
                    double width = resultSet.getDouble("width");

                    Products product = new Products(id, type, weight, name, description, priceUSD, height, width);
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            // Manejo de excepciones
        }
        return products;
    }

    public Products saveProduct(Products product) {
        try (Connection connection = ConnectDB.getInstance().getConnection()) {
            String query = "INSERT INTO products (type, weight, name, description, price_usd, height, width) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, product.getType().toString());
                statement.setDouble(2, product.getWeight());
                statement.setString(3, product.getName());
                statement.setString(4, product.getDescription());
                statement.setDouble(5, product.getPriceUSD());
                statement.setDouble(6, product.getHeight());
                statement.setDouble(7, product.getWidth());
                int affectedRows = statement.executeUpdate();
                if (affectedRows == 1) {
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            product.setId(generatedKeys.getLong(1));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new product", e);
        }
        return product;
    }

}

