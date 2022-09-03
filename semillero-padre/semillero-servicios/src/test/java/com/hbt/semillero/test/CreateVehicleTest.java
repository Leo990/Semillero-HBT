package com.hbt.semillero.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.math.BigDecimal;


import com.hbt.semillero.poo.Car;
import com.hbt.semillero.poo.enums.VehicleTypeEnum;

public class CreateVehicleTest {
    private final static Logger LOGGER = Logger.getLogger(CreateVehicleTest.class);

    @Before
    public void initialize(){
        BasicConfigurator.configure();
        LOGGER.info("message");
    }
    
    @Test
    public void whenCreateCarGivenSuccessThenOK(){
        Car mazda = new Car();
        mazda.setPrice(new BigDecimal(100));
        mazda.setColor("White");
        mazda.setType(VehicleTypeEnum.TERRESTRE);
        mazda.setCapacity(4);

        assertNotNull(mazda);
        assertEquals(VehicleTypeEnum.TERRESTRE, mazda.getType());
        assertEquals(4, mazda.getCapacity());
    }

    @Test
    public void whenDefineTypeOfVehicleGivenTrueThenOK(){
        Car mazda = new Car();
        mazda.setType(VehicleTypeEnum.ACUATICO);
        Exception exception = assertThrows(Exception.class, () -> {
            mazda.defineTypeOfVehicle(mazda.getType());
        });

        String expected = "El tipo de vehiculo asignado es erroneo, debe ser: Terrestre";

        assertNotNull(exception);
        assertEquals(expected, exception.getMessage());
    }

    @Test
    @Ignore
    public void mockExample(){
        LOGGER.info("Inicia el test de mockExample");
        Car kiaMock = new Car();
        kiaMock = mock(Car.class);
        when(kiaMock.acelerate()).thenReturn(1000);
        assertEquals(1000, kiaMock.acelerate());
        LOGGER.info("Finaliza el test de mockExample");
    }
}
