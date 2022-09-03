package com.hbt.semillero.poo.interfaces;

import com.hbt.semillero.poo.enums.VehicleTypeEnum;

public interface ITypeVehicle {
    public boolean defineTypeOfVehicle(VehicleTypeEnum vehicleTypeEnum) throws Exception;

    default public int acelerate(){
        System.out.println("El vehiculo ha iniciado a acelerar");
        return 1;
    }
}
