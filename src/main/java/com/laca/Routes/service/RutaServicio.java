package com.laca.Routes.service;

import com.laca.connectDB.ConnectDB;
import com.laca.entity.Ruta;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class RutaServicio {


    public List<Ruta> getAllRutas() {
        List<Ruta> rutas = new ArrayList<>();
        try (Connection connection = ConnectDB.getInstance().getConnection()) {
            String query = "SELECT * FROM rutas";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    long id = resultSet.getLong("id");
                    String nombre = resultSet.getString("nombre");
                    String descripcion = resultSet.getString("descripcion");
                    String origenLatitud = resultSet.getString("origen_latitud");
                    String origenLongitud = resultSet.getString("origen_longitud");
                    String destinoLatitud = resultSet.getString("destino_latitud");
                    String destinoLongitud = resultSet.getString("destino_longitud");
                    double costoRuta = resultSet.getDouble("costo_ruta");

                    Ruta ruta = new Ruta(id, nombre, descripcion, origenLatitud, origenLongitud, destinoLatitud, destinoLongitud, costoRuta);
                    rutas.add(ruta);
                }
            }
        } catch (SQLException e) {
            // Manejo de excepciones
        }
        return rutas;
    }




    public Ruta saveRuta(Ruta ruta) {
        try (Connection connection = ConnectDB.getInstance().getConnection()) {
            String query = "INSERT INTO rutas (nombre, descripcion, origen_latitud, origen_longitud, destino_latitud, destino_longitud, costo_ruta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, ruta.getNombre());
                statement.setString(2, ruta.getDescripcion());
                statement.setString(3, ruta.getOrigenLatitud());
                statement.setString(4, ruta.getOrigenLongitud());
                statement.setString(5, ruta.getDestinoLatitud());
                statement.setString(6, ruta.getDestinoLongitud());
                statement.setDouble(7, ruta.getCostoRuta());
                int affectedRows = statement.executeUpdate();
                if (affectedRows == 1) {
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            ruta.setId(generatedKeys.getLong(1));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new route", e);
        }
        return ruta;
    }
}