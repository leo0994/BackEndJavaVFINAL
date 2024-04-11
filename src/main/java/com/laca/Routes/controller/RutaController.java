package com.laca.Routes.controller;

import com.laca.Routes.service.RutaServicio;
import com.laca.entity.Ruta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rutas")
@CrossOrigin(origins = "http://localhost:4200")
public class RutaController {

    private final RutaServicio rutaServicio;

    @Autowired
    public RutaController(RutaServicio rutaServicio) {
        this.rutaServicio = rutaServicio;
    }

    @GetMapping
    public List<Ruta> getAllRutas() {
        return rutaServicio.getAllRutas();
    }

    @PostMapping
    public Ruta saveRuta(@RequestBody Ruta nuevaRuta) {
        return rutaServicio.saveRuta(nuevaRuta);
    }
}


