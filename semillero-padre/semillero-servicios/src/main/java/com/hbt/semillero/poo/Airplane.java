package com.hbt.semillero.poo;

public class Airplane extends Vehicle{

    @Override
    public int getMaxVelocity() {
        // TODO Auto-generated method stub
        return 1061;
    }

    @Override
    public Long getMaxLoadWeight() {
        // TODO Auto-generated method stub
        return 250000L;
    }

    public void start(){
        System.out.println("El vehiculo esta avanzando via aerea");
    }
    
}
