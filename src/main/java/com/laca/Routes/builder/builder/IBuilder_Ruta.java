package com.laca.Routes.builder.builder;

import com.laca.Routes.builder.components.PuntoDestino;
import com.laca.Routes.builder.components.PuntoOrigen;
import com.laca.Routes.builder.enums.TipoRuta;
import com.laca.entity.Ruta;

public interface IBuilder_Ruta {

    void setId(Long id);
    void setNombre(String nombre);
    void setDescripcion(String descripcion);
    void setOrigenLatitud(String origenLatitud);
    void setOrigenLongitud(String origenLongitud);
    void setDestinoLatitud(String destinoLatitud);
    void setDestinoLongitud(String destinoLongitud);
    void setCostoRuta(double costoRuta);

    Ruta getRuta();
}
