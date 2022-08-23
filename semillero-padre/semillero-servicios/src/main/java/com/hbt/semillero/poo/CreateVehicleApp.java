package com.hbt.semillero.poo;

import java.math.BigDecimal;

public class CreateVehicleApp {
    public static void main(String[] args) {
        Boat mazda = new Boat(4, "blue", 123, new BigDecimal(100), "sport", "1.0", 500d);
        Boat kia = new Boat(4, "red", 321, new BigDecimal(200), "sport", "2.0", 500d);

        System.out.println(mazda.toString());
        System.out.println(kia.toString());
    }
    
}
