package com.hbt.semillero.poo;

public enum VehicleTypeEnum {
    TERRESTRE("Terrestre", 1),
	ACUATICO("Acuatico", 2),
	AEREO("Aereo", 3),
	ESPACIAL("Espacial", 4);
	
	private String type;
	private int id;
	
	VehicleTypeEnum(String type, int id) {
		this.type = type;
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public int getId() {
		return id;
	}
}