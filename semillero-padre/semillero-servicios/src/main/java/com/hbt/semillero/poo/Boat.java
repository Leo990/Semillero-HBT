package com.hbt.semillero.poo;

import java.math.BigDecimal;

public class Boat extends Vehicle{

    private int numberOfSails;
    private String captain;
    private String density;
    private String finalHarbor;

    public Boat (){
        super();
    }

    public Boat(int capacity,
    String color,
    int model,
    BigDecimal price,
    String type,
    String version,
    double weight) {
        super(capacity, color, model, price, type, version, weight);
    }

    public Boat(int numberOfSails, String captain, String density, String finalHarbor) {
        this.numberOfSails = numberOfSails;
        this.captain = captain;
        this.density = density;
        this.finalHarbor = finalHarbor;
    }

    public int getNumberOfSails() {
        return this.numberOfSails;
    }

    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }

    public String getCaptain() {
        return this.captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getDensity() {
        return this.density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getFinalHarbor() {
        return this.finalHarbor;
    }

    public void setFinalHarbor(String finalHarbor) {
        this.finalHarbor = finalHarbor;
    }

    @Override
    public String toString() {
        return "{" +
            " numberOfSails='" + getNumberOfSails() + "'" +
            ", captain='" + getCaptain() + "'" +
            ", density='" + getDensity() + "'" +
            ", finalHarbor='" + getFinalHarbor() + "'" +
            "}" + super.toString();
    }
    
}
