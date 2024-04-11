package com.laca.TransportUnit.service;

import com.laca.ConnectDB.ConnectDB;
import com.laca.TransportUnit.factory.ConcreteTransportUnitCreator;
import com.laca.TransportUnit.factory.TransportType;
import com.laca.TransportUnit.factory.TransportUnit;
import com.laca.TransportUnit.factory.TransportUnitCreator;
import com.laca.entity.ConcreteTransportUnit;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransporterUnitService {

    @Transactional
    public ConcreteTransportUnit saveTransporterUnit(ConcreteTransportUnit concreteTransportUnit) {
        try (Connection connection = ConnectDB.getInstance().getConnection()) {
            String query = "INSERT INTO transporterUnits (name, licensePlate,height,width,type,maxWeight) VALUES (?, ?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, concreteTransportUnit.getName());
            statement.setString(2, concreteTransportUnit.getLicensePlate());
            statement.setDouble(3, concreteTransportUnit.getHeight());
            statement.setDouble(4, concreteTransportUnit.getWidth());
            statement.setString(5, concreteTransportUnit.getType().name());
            statement.setDouble(6, concreteTransportUnit.getMaxWeight());
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    concreteTransportUnit.setId(generatedKeys.getLong(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new transporter");
        }
        return concreteTransportUnit;
    }


    @Transactional
    public List<ConcreteTransportUnit> getAllTransporterUnits() {
        List<ConcreteTransportUnit> transporterUnitList = new ArrayList<>();
        try (Connection connection = ConnectDB.getInstance().getConnection()) {
            String query = "SELECT * FROM transporterunits";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String licensePlate = resultSet.getString("licensePlate");
                double height = resultSet.getDouble("height");
                double width = resultSet.getDouble("width");
                String type = resultSet.getString("type");
                TransportType enumType = TransportType.valueOf(type);
                double maxWeight = resultSet.getDouble("maxWeight");
                TransportUnit transporterUnit = ConcreteTransportUnitCreator.getInstance().createTransportUnit(id,name,licensePlate,height,width,enumType,maxWeight);
                transporterUnitList.add((ConcreteTransportUnit) transporterUnit);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving transporters"+ e);
        }
        return transporterUnitList;
    }


}
