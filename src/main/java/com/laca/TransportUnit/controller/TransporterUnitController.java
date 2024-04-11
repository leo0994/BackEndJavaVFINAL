package com.laca.TransportUnit.controller;


import com.laca.TransportUnit.service.TransporterUnitService;
import com.laca.entity.ConcreteTransportUnit;
import com.laca.registersCommand.concreteCommand1.ConcreteTransportUnitRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transporterUnits")
@CrossOrigin(origins = "http://localhost:4200/")

public class TransporterUnitController {

    private final TransporterUnitService transporterUnitService;

    @Autowired
    public TransporterUnitController(TransporterUnitService transporterUnitService) {
        this.transporterUnitService = transporterUnitService;
    }

    @PostMapping("/register")
    public String registerTransportUnit(@RequestBody ConcreteTransportUnit concreteTransportUnit) {
        ConcreteTransportUnitRegister command = new ConcreteTransportUnitRegister(transporterUnitService, concreteTransportUnit);
        command.execute(); // Ejecutar el comando directamente
        return "Se a registrado su unidad de transporte";
    }

    @PostMapping
    public ConcreteTransportUnit saveTransporterUnit(@RequestBody ConcreteTransportUnit concreteTransportUnit) {
        return transporterUnitService.saveTransporterUnit(concreteTransportUnit);
    }

    @GetMapping
    public List<ConcreteTransportUnit> getAllTransporters() {
        List<ConcreteTransportUnit> transporterUnits = transporterUnitService.getAllTransporterUnits();
        return transporterUnits;
    }
}
