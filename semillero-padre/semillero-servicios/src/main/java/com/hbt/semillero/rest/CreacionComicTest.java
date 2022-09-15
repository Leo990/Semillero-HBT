package com.hbt.semillero.rest;

import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.entity.Comic;
import com.hbt.semillero.enums.EstadoEnum;

/**
 * 		
 * <b>Descripción:<b> Clase que determina algunos metodos de verificacion sobre los comics
 * <b>Caso de Uso:CUTA<b> 
 * @author Leonardo Sanchez Camaccho
 * @version 1.0
 */
public class CreacionComicTest {
    
    private List<Comic> comics;


    public CreacionComicTest() {
        this.comics = new ArrayList<Comic>();
    }

    public CreacionComicTest(List<Comic> comics) {
        this.comics = comics;
    }

    private List<Comic> verificarEstadoComics(EstadoEnum estado){
        List<Comic> activos = new ArrayList<Comic>();
    
        for(Comic comic : this.comics){
            if(comic.getEstado().equals(estado)){
                activos.add(comic);
            }
        }
        return activos;
    }
    

    public List<Comic> verificarComicsActivos(){
        return verificarEstadoComics(EstadoEnum.ACTIVO);
    }
    
    public List<Comic> verificarComicsInactivos(){
        return verificarEstadoComics(EstadoEnum.INACTIVO);
    }


}
