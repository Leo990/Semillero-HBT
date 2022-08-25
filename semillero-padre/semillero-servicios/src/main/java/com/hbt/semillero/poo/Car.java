package com.hbt.semillero.poo;

import java.math.BigDecimal;

import org.apache.log4j.*;

public class Car extends Vehicle implements ITypeVehicle{

    private final static Logger LOGGER = Logger.getLogger(Car.class);

    public Car(){
        super();
        BasicConfigurator.configure();
    }

    public Car(BigDecimal price){
        super(price);
    }

    public Car(int capacidad,
            String color,
            int model,
            BigDecimal price,
            VehicleTypeEnum type,
            String version,
            double weight){
                super(capacidad, color, model, price, type, version, weight);
            }

    @Override
    public int getMaxVelocity() {
        // TODO Auto-generated method stub
        return 300;
    }

    @Override
    public Long getMaxLoadWeight() {
        // TODO Auto-generated method stub
        return 1000L;
    }

    @Override
    public boolean defineTypeOfVehicle(VehicleTypeEnum vehicleTypeEnum) throws Exception {
        // TODO Auto-generated method stub
        if(VehicleTypeEnum.TERRESTRE.getId() == vehicleTypeEnum.getId()) {
            System.out.println("El vehiculo si es del tipo asignado (" +
            vehicleTypeEnum.getType() + ").");
            return true;
        }else {
            LOGGER.info("Se ha presentado un error");
            throw new Exception("El tipo de vehiculo asignado es erroneo, debe ser: " +
            VehicleTypeEnum.TERRESTRE.getType());
        }
    }

     
    
}
