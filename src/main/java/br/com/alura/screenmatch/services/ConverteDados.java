package br.com.alura.screenmatch.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> clasee) {
        try {
            return mapper.readValue(json, clasee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

