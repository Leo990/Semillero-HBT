package com.hbt.semillero.poo;

import com.hbt.semillero.poo.abstracts.Vehicle;
import com.hbt.semillero.poo.enums.VehicleTypeEnum;
import com.hbt.semillero.poo.interfaces.ITypeVehicle;

public class Bicycle extends Vehicle implements ITypeVehicle{

    @Override
    public int getMaxVelocity() {
        return 10;
    }

    @Override
    public Long getMaxLoadWeight() {
        return 90L;
    }

    @Override
    public boolean defineTypeOfVehicle(VehicleTypeEnum vehicleTypeEnum) throws Exception {
        return false;
    }

}
