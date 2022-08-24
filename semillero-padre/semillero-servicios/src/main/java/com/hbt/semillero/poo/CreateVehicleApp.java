package com.hbt.semillero.poo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateVehicleApp {

    private static final BigDecimal SMLV = new BigDecimal(100000);
	private static final String VELOCIDAD_MAXIMA = "Velocidad maxima:";
    public static void main(String[] args) {
        Vehicle mazda = new Car(new BigDecimal(105));
		//BigDecimal valorPrecio = new BigDecimal(105);

		//mazda.setPrecio(new BigDecimal(105));

		Long valor1 = 100L;
		Float valor2 = 100F;
		Double valor3 = 100D;

        Vehicle kia = new Car(2022, "red", 2022, new BigDecimal(110), VehicleTypeEnum.TERRESTRE, "1.0", 1000D);
		
		if(kia.getType().equals(VehicleTypeEnum.TERRESTRE) ) {
			// WIP
			System.out.println("El vehiculo es terrestre");
		} else {
			System.out.println("El vehiculo es " + kia.getType());
		}	

		Boat boat = new Boat(3, "Semillero", "999", "Barranquilla");

		boat.setColor("Blanco");

		System.out.println("Valor vehiculo mazda es de: " + mazda.getPrice());
		System.out.println("Valor vehiculo kia es de: " + kia.toString());
		System.out.println("Valor vehiculo barco es de: " + boat.toString());

		// Polimorfismo

		Airplane avion = new Airplane();
		avion.start();

		Vehicle avion2 = new Airplane();
		avion2.start();

		Bicycle bicicleta = new Bicycle();
		bicicleta.acelerate();
		System.out.println(VELOCIDAD_MAXIMA + bicicleta.getMaxVelocity());
		System.out.println("Peso maximo:" + bicicleta.getMaxLoadWeight());

		//AccionesVehiculoAbstract v1 = new AccionesVehiculoAbstract();

		//Avion avion3 = new Vehiculo(); genera error

		Car auto = new Car(new BigDecimal(999999));
		auto.setType(VehicleTypeEnum.TERRESTRE);
		auto.acelerate();
		System.out.println(VELOCIDAD_MAXIMA + auto.getMaxVelocity());
		System.out.println("Peso maximo:" + auto.getMaxLoadWeight());
		
		try {
			auto.defineTypeOfVehicle(auto.getType());
		} catch (Exception e) {
			System.out.println("SE HA PRESESENTADO UN ERROR " + e.getMessage());
		}

		List<Vehicle> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(auto);
		listaVehiculos.add(kia);
		listaVehiculos.add(boat);
		for (Vehicle vehiculo : listaVehiculos) {
			System.out.println(vehiculo.getPrice());
		}
		
		listaVehiculos.remove(kia);
		for (Vehicle vehiculo : listaVehiculos) {
			System.out.println(vehiculo.getPrice());
		}
		
		Map<String, Vehicle> mapaVehiculos = new HashMap<>();
		mapaVehiculos.put("china",kia);
		mapaVehiculos.put("japon",mazda);
		
		System.out.println(mapaVehiculos.get("china"));
    }
    
}
