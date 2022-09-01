package com.hbt.semillero.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    
    public JsonUtils(){
        throw new IllegalStateException("Utility Class");
    }

    public static <T> T valueOf(String arg, Class<T> claseDTO) {
        try {
            return new ObjectMapper().readValue(arg, claseDTO);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    public static String toStringJson(Object dto){
        try {
            return new  ObjectMapper().writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            // TODO: handle exception
            return null;
        }
    }
}
