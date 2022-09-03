package com.hbt.semillero.poo.abstracts;

import java.math.BigDecimal;

import com.hbt.semillero.poo.enums.VehicleTypeEnum;

public abstract class Vehicle {
    private int capacity;
    private String color;
    private int model;
    private BigDecimal price;
    private VehicleTypeEnum type;
    private String version;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(BigDecimal price){
        this.price = price;
    }

    public Vehicle(int capacidad,
            String color,
            int model,
            BigDecimal price,
            VehicleTypeEnum type,
            String version,
            double weight) {
                this.capacity = capacidad;
                this.color = color;
                this.model = model;
                this.price = price;
                this.type = type;
                this.version = version;
                this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacidad) {
        this.capacity = capacidad;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return this.model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public VehicleTypeEnum getType() {
        return this.type;
    }

    public void setType(VehicleTypeEnum type) {
        this.type = type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "{" +
            " capacity='" + getCapacity() + "'" +
            ", color='" + getColor() + "'" +
            ", model='" + getModel() + "'" +
            ", price='" + getPrice() + "'" +
            ", type='" + getType() + "'" +
            ", version='" + getVersion() + "'" +
            ", weight='" + getWeight() + "'" +
            "}";
    }

    public abstract int getMaxVelocity();

    public abstract Long getMaxLoadWeight();

    public void start(){
        System.out.println("El vehiculo esta arrancando");
    }
    
}