package com.hbt.semillero.poo;

public class Bicycle extends Vehicle implements ITypeVehicle{

    @Override
    public int getMaxVelocity() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public Long getMaxLoadWeight() {
        // TODO Auto-generated method stub
        return 90L;
    }

    @Override
    public boolean defineTypeOfVehicle(VehicleTypeEnum vehicleTypeEnum) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

}
