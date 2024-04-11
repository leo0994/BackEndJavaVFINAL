package com.laca.Routes.builder.director;

import com.laca.Routes.builder.builder.IBuilder_Ruta;
import com.laca.Routes.builder.clases.Coordenadas;
import com.laca.Routes.builder.components.PuntoDestino;
import com.laca.Routes.builder.components.PuntoOrigen;
import com.laca.Routes.builder.enums.TipoRuta;
import com.laca.TransportUnit.factory.ConcreteTransportUnitCreator;
import com.laca.entity.Ruta;

public class RutaBuilderDirector {

    private static final RutaBuilderDirector instance = new RutaBuilderDirector();

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private RutaBuilderDirector() {}

    // Método estático para obtener la instancia única del creador
    public static RutaBuilderDirector getInstance() {
        return instance;
    }
    public void buildRuta(IBuilder_Ruta builder, long id, String origenLatitud, String origenLongitud, String destinoLongitud, String destinoLatitud, String nombre, String descripcion, double costoRuta) {
        builder.setId(id); // Debes incluir la asignación del ID, asumiendo que tu builder tiene un método setId()
        builder.setNombre(nombre);
        builder.setDescripcion(descripcion);
        builder.setOrigenLatitud(origenLatitud);
        builder.setOrigenLongitud(origenLongitud);
        builder.setDestinoLatitud(destinoLatitud);
        builder.setDestinoLongitud(destinoLongitud);
        builder.setCostoRuta(costoRuta);
    }


}
