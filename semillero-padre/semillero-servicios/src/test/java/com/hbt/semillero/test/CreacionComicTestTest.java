package com.hbt.semillero.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hbt.semillero.entity.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;
import com.hbt.semillero.rest.CreacionComicTest;

public class CreacionComicTestTest {
    public static List<Comic> comics = new ArrayList<>();

    @Before
    public void initialize(){
        comics.add(new Comic(1L, "Warbug & Beach", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(2L, "Todo bajo el sol", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(3L, "Romeo Muerto", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.NO_DISPONIBLE, (short)1));
        comics.add(new Comic(4L, "Polen dorado", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(5L, "Los grandes espacios", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(6L, "Saqueo", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.NO_DISPONIBLE, (short)1));
        comics.add(new Comic(7L, "El pacto", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(8L, "Hoops", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(9L, "La isla", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        comics.add(new Comic(10L, "The Beano", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.NO_DISPONIBLE, (short)1));
    }

    @Test
    public void whenVerificarComicsActivosGivenSuccesThenOK(){

        CreacionComicTest c = new CreacionComicTest(comics);

        List<Comic> expected = new ArrayList<>();
        expected.add(new Comic(1L, "Warbug & Beach", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        expected.add(new Comic(2L, "Todo bajo el sol", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        expected.add(new Comic(4L, "Polen dorado", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        expected.add(new Comic(5L, "Los grandes espacios", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        expected.add(new Comic(7L, "El pacto", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        expected.add(new Comic(8L, "Hoops", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));
        expected.add(new Comic(9L, "La isla", TematicaEnum.CIENCIA_FICCION, true, LocalDate.now(), "DC", "coleccion", (short)1, new BigDecimal(100), "AA", EstadoEnum.DISPONIBLE, (short)1));

        List<Comic> actuals = c.verificarComicsActivos();

        assertNotNull(c);
        assertNotNull(actuals);
        assertArrayEquals(expected.toArray(), actuals.toArray());
    }
}
