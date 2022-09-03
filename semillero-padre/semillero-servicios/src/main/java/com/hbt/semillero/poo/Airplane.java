package com.hbt.semillero.poo;

import com.hbt.semillero.poo.abstracts.Vehicle;

public class Airplane extends Vehicle{

    @Override
    public int getMaxVelocity() {
        return 1061;
    }

    @Override
    public Long getMaxLoadWeight() {
        return 250000L;
    }

    public void start(){
        System.out.println("El vehiculo esta avanzando via aerea");
    }
    
}
