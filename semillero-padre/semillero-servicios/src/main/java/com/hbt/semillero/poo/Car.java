package com.hbt.semillero.poo;

import java.math.BigDecimal;

import org.apache.log4j.*;

import com.hbt.semillero.poo.abstracts.Vehicle;
import com.hbt.semillero.poo.enums.VehicleTypeEnum;
import com.hbt.semillero.poo.interfaces.ITypeVehicle;

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
        return 300;
    }

    @Override
    public Long getMaxLoadWeight() {
        return 1000L;
    }

    @Override
    public boolean defineTypeOfVehicle(VehicleTypeEnum vehicleTypeEnum) throws Exception {
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
