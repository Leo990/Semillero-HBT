package com.hbt.semillero.poo;

public interface ITypeVehicle {
    public boolean defineTypeOfVehicle(VehicleTypeEnum vehicleTypeEnum) throws Exception;

    default public void acelerate(){
        System.out.println("El vehiculo ha iniciado a acelerar");
    }
}
