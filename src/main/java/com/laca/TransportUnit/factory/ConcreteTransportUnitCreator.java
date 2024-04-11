package com.laca.TransportUnit.factory;

import com.laca.entity.ConcreteTransportUnit;
import org.springframework.stereotype.Service;

@Service
public class ConcreteTransportUnitCreator extends TransportUnitCreator {
    // Implementación del método factory para crear unidades de transporte

    // Instancia única del creador
    private static final ConcreteTransportUnitCreator instance = new ConcreteTransportUnitCreator();

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private ConcreteTransportUnitCreator() {}

    // Método estático para obtener la instancia única del creador
    public static ConcreteTransportUnitCreator getInstance() {
        return instance;
    }

    @Override
    public TransportUnit createTransportUnit(long id, String name, String licensePlate, double height, double width, TransportType type, double maxWeight) {
        switch (type) {
            case A_PIE:
                return new ConcreteTransportUnit(id, name, null,height , width, TransportType.A_PIE, maxWeight);
            case MOTO:
                return new ConcreteTransportUnit(id, name, licensePlate, height, width, TransportType.MOTO, maxWeight);
            case CAMION:
                return new ConcreteTransportUnit(id, name, licensePlate, height, width, TransportType.CAMION, maxWeight);
            case CAMIONETA:
                return new ConcreteTransportUnit(id, name, licensePlate, height, width, TransportType.CAMIONETA, maxWeight);
            default:
                throw new IllegalArgumentException("Tipo de transporte no válido: " + type);
        }
    }
}



