package com.laca.registersCommand.concreteCommand1;

import com.laca.TransportUnit.service.TransporterUnitService;
import com.laca.entity.ConcreteTransportUnit;
import com.laca.registersCommand.cInterface.Command;

public class ConcreteTransportUnitRegister implements Command {
    private final TransporterUnitService transporterUnitService;
    private final ConcreteTransportUnit transportUnit;

    public ConcreteTransportUnitRegister(TransporterUnitService transporterUnitService, ConcreteTransportUnit transportUnit) {
        this.transporterUnitService = transporterUnitService;
        this.transportUnit = transportUnit;
    }

    @Override
    public void execute() {
        transporterUnitService.saveTransporterUnit(transportUnit);
    }


}
